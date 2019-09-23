def playbook(String inventory, String rolePath) {
    echo "Execute Ansible role..."
    def path = "pwd"
    //sh(path)
    def shellCommand = "ansible-playbook -i  ${inventory} --role  ${rolePath}"
    echo "Command is: ${shellCommand}"
    
    //sh(shellCommand)
}
def gitClone(String url) {
	echo "Executing Git Clone to download Jenkins Installation ansible role"
	//echo "${url}"
	def path = "dir"
	path.execute()
	//def shellCommand = "git clone --branch=master ${url}".execute();
	echo "Command is: ${shellCommand}"
    	//sh(shellCommand)
}
