package pub.devrel.easypermissions.sample

import pub.devrel.easypermissions.EasyPermissions

object TestIssue {

    interface TestCallbacks : EasyPermissions.PermissionCallbacks {

        override fun onPermissionsGranted(requestCode: Int, perms: List<String>)

        override fun onPermissionsDenied(requestCode: Int, perms: List<String>)
    }

    fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray,
                                   vararg receivers: Any) {
        // Use spread operator https://kotlinlang.org/docs/reference/java-interop.html#java-varargs
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, *receivers)
    }
}
