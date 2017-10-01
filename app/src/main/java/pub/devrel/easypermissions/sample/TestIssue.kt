package pub.devrel.easypermissions.sample

import pub.devrel.easypermissions.EasyPermissions

object TestIssue {

    interface TestCallbacks : EasyPermissions.PermissionCallbacks {

        override fun onPermissionsGranted(requestCode: Int, perms: List<String>)

        override fun onPermissionsDenied(requestCode: Int, perms: List<String>)
    }
}
