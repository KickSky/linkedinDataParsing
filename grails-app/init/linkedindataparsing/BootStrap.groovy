package linkedindataparsing

import grails.plugin.springsecurity.SpringSecurityService
import linkedindataparsing.*

class BootStrap {

    SpringSecurityService springSecurityService

    def init = { servletContext ->
        def adminUser = SecUser.findByUsername('admin') ?: new SecUser(
                username: 'admin',
                password: springSecurityService.encodePassword('admin'),
                enabled: true).save(failOnError: true)

        def adminRole = SecRole.findByAuthority('ROLE_ADMIN') ?:
                new SecRole(authority: 'ROLE_ADMIN').save(failOnError: true)

        if (!adminUser.authorities.contains(adminRole)) {
            SecUserSecRole.create adminUser, adminRole
        }
    }
    def destroy = {
    }
}
