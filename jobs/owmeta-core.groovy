multibranchPipelineJob('owmeta-core') {
    branchSources {
        git {
            id('x3nHl4pZOAHhmiHTzHerCjbuq7qPJdPz') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/openworm/owmeta-core.git')
            credentialsId('github-ci')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
