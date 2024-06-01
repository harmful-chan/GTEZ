
# "获取脚本所在目录"
$scriptDirectory = Split-Path -Parent $MyInvocation.MyCommand.Path

$envFilePath = Join-Path -Path $scriptDirectory -ChildPath "..\.env"


Write-Output $envFilePath
# "读取.env文件中的内容并设置环境变量"
Get-Content $envFilePath | ForEach-Object {
    if (-not $_.StartsWith("#") -and $_ -match '^(.+?)=(.+)$') {
        $envVarName = $matches[1].Trim()
        $envVarValue = $matches[2].Trim()
        Write-Output $envVarName=$envVarValue

            [Environment]::SetEnvironmentVariable($envVarName, $envVarValue)
    }
}