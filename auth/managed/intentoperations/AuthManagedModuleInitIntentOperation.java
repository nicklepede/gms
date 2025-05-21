package com.google.android.gms.auth.managed.intentoperations;

import android.content.Intent;
import com.google.android.gms.auth.managed.ui.SetupWorkProfileChimeraActivity;
import defpackage.abqh;
import defpackage.abrx;
import defpackage.abzx;
import defpackage.asej;
import defpackage.asot;
import defpackage.dtjk;
import defpackage.fiwo;
import defpackage.fkzn;
import defpackage.fkzo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthManagedModuleInitIntentOperation extends abrx {
    protected static final String[] a;
    public fiwo b;

    static {
        asot.b("Auth", asej.AUTH_MANAGED_WORK_PROFILE);
        a = new String[]{"com.google.android.gms.auth.managed.ui.EmmActivity", "com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallActivity"};
    }

    private final void i() {
        SetupWorkProfileChimeraActivity.c(getBaseContext(), SetupWorkProfileSettingsIntentOperation.e(getBaseContext()));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:4|2)|5|6|(2:8|(4:12|(1:14)(1:34)|15|(8:19|20|(1:22)(1:33)|23|24|25|26|27)))|35|20|(0)(0)|23|24|25|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        android.util.Log.w("Auth", java.lang.String.format(java.util.Locale.US, "[AuthManaged, AuthManagedModuleInitIntentOperation] Component is not available", new java.lang.Object[0]), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l() {
        /*
            r10 = this;
            eihy r0 = new eihy
            java.lang.String r1 = "; "
            r0.<init>(r1)
            eihv r1 = new eihv
            r1.<init>(r0, r0)
            java.lang.String[] r0 = com.google.android.gms.auth.managed.intentoperations.AuthManagedModuleInitIntentOperation.a
            int r2 = r0.length
            r1.f(r0)
            r1 = 0
            r2 = r1
        L14:
            r3 = 2
            r4 = 1
            java.lang.String r5 = "Auth"
            if (r2 >= r3) goto L3b
            r3 = r0[r2]
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r9 = "[AuthManaged, AuthManagedModuleInitIntentOperation] enabling "
            java.lang.String r6 = r9.concat(r6)
            java.lang.String r6 = java.lang.String.format(r7, r6, r8)
            android.util.Log.i(r5, r6)
            android.content.Context r5 = r10.getBaseContext()
            defpackage.asng.H(r5, r3, r4)
            int r2 = r2 + 1
            goto L14
        L3b:
            flbk r0 = defpackage.flbk.a
            flbl r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 == 0) goto L95
            android.content.Context r0 = r10.getBaseContext()
            boolean r2 = defpackage.asqh.c()
            if (r2 != 0) goto L52
            goto L95
        L52:
            java.lang.String r2 = "device_policy"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.app.admin.DevicePolicyManager r2 = (android.app.admin.DevicePolicyManager) r2
            if (r2 != 0) goto L5d
            goto L95
        L5d:
            java.lang.String r3 = r2.getDeviceOwner()
            if (r3 == 0) goto L68
            java.lang.String r3 = r2.getDeviceOwner()
            goto L6a
        L68:
            java.lang.String r3 = "n/a"
        L6a:
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r8 = "[AuthManaged, SettingsSecurityDeviceOwnerChimeraActivity] device owner: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r8.concat(r3)
            java.lang.String r3 = java.lang.String.format(r7, r3, r6)
            android.util.Log.w(r5, r3)
            java.lang.String r3 = "com.google.android.apps.work.clouddpc"
            boolean r2 = r2.isDeviceOwnerApp(r3)
            if (r2 == 0) goto L95
            android.content.Intent r2 = com.google.android.gms.auth.managed.ui.SettingsSecurityDeviceOwnerChimeraActivity.h
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.pm.ActivityInfo r0 = r2.resolveActivityInfo(r0, r1)
            if (r0 == 0) goto L95
            r0 = r4
            goto L96
        L95:
            r0 = r1
        L96:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "[AuthManaged, AuthManagedModuleInitIntentOperation] "
            r3.<init>(r6)
            if (r4 == r0) goto La4
            java.lang.String r4 = "disabling "
            goto La6
        La4:
            java.lang.String r4 = "enabling "
        La6:
            r3.append(r4)
            java.lang.String r4 = "com.google.android.gms.auth.managed.ui.SettingsSecurityDeviceOwnerActivity"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r2 = java.lang.String.format(r2, r3, r6)
            android.util.Log.i(r5, r2)
            android.content.Context r2 = r10.getBaseContext()     // Catch: java.lang.IllegalArgumentException -> Lc3
            defpackage.asng.H(r2, r4, r0)     // Catch: java.lang.IllegalArgumentException -> Lc3
            goto Ld3
        Lc3:
            r2 = move-exception
            if (r0 == 0) goto Ld3
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "[AuthManaged, AuthManagedModuleInitIntentOperation] Component is not available"
            java.lang.String r0 = java.lang.String.format(r0, r3, r1)
            android.util.Log.w(r5, r0, r2)
        Ld3:
            r10.i()
            abzx r0 = defpackage.abzx.f()
            r0.h(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.managed.intentoperations.AuthManagedModuleInitIntentOperation.l():void");
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        l();
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (fkzn.e()) {
            ((dtjk) this.b.a()).a();
        }
        l();
        fkzo.e();
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        i();
        abzx.f().h(this);
        if (abzx.f().i()) {
            abqh.b().d(this);
        }
    }
}
