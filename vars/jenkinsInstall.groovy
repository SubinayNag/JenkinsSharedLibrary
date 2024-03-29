def playbook(String inventory, String rolePath) {
    echo "Execute Ansible role..."
    def shellCommand = "ansible-playbook -i  ${inventory} ${rolePath}"
    echo "Command is: ${shellCommand}"
    sh(shellCommand)
}
def gitClone(String url) {
	echo "Executing Git Clone to download Jenkins Installation ansible role"
	echo "${url}"
	def shellCommand = "git clone ${url}"
	echo "Command is: ${shellCommand}"
    	sh(shellCommand)
}
