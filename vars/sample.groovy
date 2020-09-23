pipeline{
	agent any
	stages{
		stage('Sample')
		{
			steps{
				echo 'This is for checking shared library'
			}
		}
	}
}