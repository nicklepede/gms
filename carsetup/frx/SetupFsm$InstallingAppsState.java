package com.google.android.gms.carsetup.frx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;
import com.google.android.gms.carsetup.fsm.impl.ActivityResult;
import defpackage.anac;
import defpackage.anvq;
import defpackage.anwc;
import defpackage.anwd;
import defpackage.anwg;
import defpackage.anwn;
import defpackage.anwp;
import defpackage.anwr;
import defpackage.anws;
import defpackage.anwt;
import defpackage.anxa;
import defpackage.anxe;
import defpackage.dg;
import defpackage.ekvl;
import defpackage.eluq;
import defpackage.eolj;
import defpackage.eolk;
import defpackage.eoll;
import defpackage.fgrc;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@anwt(a = {@anws(c = SetupFsm$CarMovingState.class, d = "EVENT_CAR_STARTED_MOVING"), @anws(a = SetupFsm$InstallingAppsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_ERROR"), @anws(a = SetupFsm$InstallingAppsState.class, c = SetupFsm$SetupFailedState.class, d = "EVENT_CAR_DISCONNECTED"), @anws(a = SetupFsm$InstallingAppsState.class, c = SetupFsm$StartCarService.class, d = "EVENT_APPLICATIONS_UP_TO_DATE"), @anws(a = SetupFsm$InstallingAppsState.class, c = SetupFsm$ErrorState.class, d = "EVENT_APPLICATION_INSTALLATION_FAILED")})
/* loaded from: classes3.dex */
public class SetupFsm$InstallingAppsState extends anwr {
    public int a;
    private boolean d;
    private boolean e;
    private BroadcastReceiver f;
    private BroadcastReceiver g;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    /* renamed from: com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState$2, reason: invalid class name */
    public class AnonymousClass2 extends TracingBroadcastReceiver {
        public AnonymousClass2() {
            super("car_setup");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            eluq eluqVar = anwd.a;
            if ("com.google.android.projection.gearhead".equals(intent.getData().getSchemeSpecificPart())) {
                ExecutorService b = anac.b(1);
                b.execute(new anwc(this));
                b.shutdown();
            }
        }
    }

    public static void f(InputStream inputStream, byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            int read = inputStream.read(bArr, i, length - i);
            if (read <= 0) {
                break;
            } else {
                i += read;
            }
        }
        if (i < length) {
            throw new IOException("Manifest underflow");
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private final boolean i() {
        Intent z = ((anwg) this.c.k).z();
        if (z != null) {
            int i = anxe.a;
            String stringExtra = z.getStringExtra("full_docid");
            ekvl.y(stringExtra);
            if (stringExtra.equals("com.google.android.projection.gearhead") && !this.e) {
                this.e = true;
                this.f = new TracingBroadcastReceiver() { // from class: com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState.1
                    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                    public final void jP(Context context, Intent intent) {
                        eluq eluqVar = anwd.a;
                        SetupFsm$InstallingAppsState setupFsm$InstallingAppsState = SetupFsm$InstallingAppsState.this;
                        if (setupFsm$InstallingAppsState.e() >= setupFsm$InstallingAppsState.a) {
                            setupFsm$InstallingAppsState.g();
                        }
                    }
                };
                this.g = new AnonymousClass2();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED");
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter2.addDataScheme("package");
                this.b.registerReceiver(this.f, intentFilter);
                this.b.registerReceiver(this.g, intentFilter2);
            }
            if (z.resolveActivity(this.b.getPackageManager()) == null) {
                this.c.d("EVENT_ERROR");
                return false;
            }
            this.c.i(z);
        }
        return true;
    }

    @Override // defpackage.anwr
    public final int a() {
        return 7;
    }

    @Override // defpackage.anwr
    public final boolean b(String str, Object obj) {
        if ("EVENT_APPLICATION_INSTALLATION_UPDATE".equals(str) || "EVENT_APPLICATION_INSTALLED".equals(str)) {
            anwp anwpVar = this.c.i;
            dg a = anwpVar != null ? anwpVar.a() : null;
            if (a != null && (a instanceof anvq)) {
                ((anvq) a).x();
            }
        } else if ("EVENT_ACTIVITY_RESULT".equals(str)) {
            if (obj != null && ((ActivityResult) obj).a == 0) {
                Bundle bundle = new Bundle();
                bundle.putString("errorTitle", this.b.getString(R.string.common_something_went_wrong));
                anxa A = ((anwg) this.c.k).A();
                Context context = this.b;
                bundle.putString("errorMessage", context.getString(R.string.car_frx_apps_installation_aborted_message, anxe.c(context, A)));
                this.c.e("EVENT_APPLICATION_INSTALLATION_FAILED", bundle);
                anwn anwnVar = this.c;
                fgrc v = eoll.a.v();
                int i = eolk.FRX_INSTALL_APPS.gC;
                if (!v.b.L()) {
                    v.U();
                }
                eoll eollVar = (eoll) v.b;
                eollVar.b |= 1;
                eollVar.d = i;
                int a2 = eolj.bP.a();
                if (!v.b.L()) {
                    v.U();
                }
                eoll eollVar2 = (eoll) v.b;
                eollVar2.b |= 2;
                eollVar2.e = a2;
                anwnVar.f((eoll) v.Q());
            }
            return true;
        }
        if (!"EVENT_APPLICATION_INSTALLED".equals(str)) {
            if ("EVENT_APPLICATIONS_UP_TO_DATE".equals(str)) {
                if (!((anwg) this.c.k).O()) {
                    anwd.a.j().ai(2839).x("Got event that applications are updated, but failed verification");
                }
                if (this.e) {
                    this.d = true;
                    return true;
                }
            }
            if (!"EVENT_CAR_STARTED_MOVING".equals(str)) {
                g();
            }
            return ("EVENT_CAR_STARTED_MOVING".equals(str) || "EVENT_ERROR".equals(str) || "EVENT_CAR_DISCONNECTED".equals(str) || "EVENT_APPLICATIONS_UP_TO_DATE".equals(str) || "EVENT_APPLICATION_INSTALLATION_FAILED".equals(str)) ? false : true;
        }
        i();
        anwn anwnVar2 = this.c;
        fgrc v2 = eoll.a.v();
        int i2 = eolk.FRX_INSTALL_APPS.gC;
        if (!v2.b.L()) {
            v2.U();
        }
        eoll eollVar3 = (eoll) v2.b;
        eollVar3.b |= 1;
        eollVar3.d = i2;
        int a3 = eolj.bR.a();
        if (!v2.b.L()) {
            v2.U();
        }
        eoll eollVar4 = (eoll) v2.b;
        eollVar4.b |= 2;
        eollVar4.e = a3;
        anwnVar2.f((eoll) v2.Q());
        return true;
    }

    @Override // defpackage.anwr
    public final void c(String str) {
        anwg anwgVar = (anwg) this.c.k;
        if ("EVENT_CAR_PARKED".equals(str)) {
            if (anwgVar.O()) {
                this.c.d("EVENT_APPLICATIONS_UP_TO_DATE");
                return;
            } else {
                if (i()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("installation_allowed", true);
                    this.c.k(anvq.class, bundle, true);
                    return;
                }
                return;
            }
        }
        if (anwgVar.T()) {
            anwgVar.D();
            if (i()) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("installation_allowed", true);
                this.c.k(anvq.class, bundle2, true);
                return;
            }
            return;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("errorTitle", this.b.getString(R.string.car_frx_no_connection_title));
        bundle3.putString("errorMessage", this.b.getString(R.string.car_frx_no_connection_message));
        this.c.e("EVENT_APPLICATION_INSTALLATION_FAILED", bundle3);
        anwn anwnVar = this.c;
        fgrc v = eoll.a.v();
        int i = eolk.FRX_INSTALL_APPS.gC;
        if (!v.b.L()) {
            v.U();
        }
        eoll eollVar = (eoll) v.b;
        eollVar.b = 1 | eollVar.b;
        eollVar.d = i;
        int a = eolj.bO.a();
        if (!v.b.L()) {
            v.U();
        }
        eoll eollVar2 = (eoll) v.b;
        eollVar2.b |= 2;
        eollVar2.e = a;
        anwnVar.f((eoll) v.Q());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r2 = r3.moduleVersion;
        r0 = defpackage.amzq.a.h().ai(2156);
        r3 = r3.moduleApk;
        r0.N("Module APK info: %s %d", r3.apkPackageName, r3.apkVersionCode);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() {
        /*
            r5 = this;
            android.content.Context r0 = r5.b
            eluq r1 = defpackage.amzq.a
            java.lang.String r1 = "com.google.android.gms.car"
            r2 = 2147483647(0x7fffffff, float:NaN)
            com.google.android.chimera.config.ModuleManager r0 = com.google.android.chimera.config.ModuleManager.get(r0)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.util.Collection r0 = r0.getAllModules()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
        L15:
            boolean r3 = r0.hasNext()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            if (r3 == 0) goto L42
            java.lang.Object r3 = r0.next()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            com.google.android.chimera.config.ModuleManager$ModuleInfo r3 = (com.google.android.chimera.config.ModuleManager.ModuleInfo) r3     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.lang.String r4 = r3.moduleId     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            boolean r4 = r1.equals(r4)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            if (r4 == 0) goto L15
            int r2 = r3.moduleVersion     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            eluq r0 = defpackage.amzq.a     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            eltz r0 = r0.h()     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            r1 = 2156(0x86c, float:3.021E-42)
            eltz r0 = r0.ai(r1)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.lang.String r1 = "Module APK info: %s %d"
            com.google.android.chimera.config.ModuleManager$ModuleApkInfo r3 = r3.moduleApk     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            java.lang.String r4 = r3.apkPackageName     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            int r3 = r3.apkVersionCode     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
            r0.N(r1, r4, r3)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L42
        L42:
            eluq r0 = defpackage.amzq.a
            eltz r0 = r0.h()
            r1 = 2155(0x86b, float:3.02E-42)
            eltz r0 = r0.ai(r1)
            java.lang.String r1 = "Current module version %d"
            r0.z(r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.carsetup.frx.SetupFsm$InstallingAppsState.e():int");
    }

    public final void g() {
        if (this.e) {
            this.b.unregisterReceiver(this.f);
            this.b.unregisterReceiver(this.g);
            this.e = false;
            if (this.d) {
                this.c.d("EVENT_APPLICATIONS_UP_TO_DATE");
            }
        }
    }
}
