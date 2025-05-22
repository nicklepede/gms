package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.UserManager;
import com.google.android.chimera.IntentOperation;
import defpackage.aury;
import defpackage.auto;
import defpackage.auua;
import defpackage.auub;
import defpackage.bzlt;
import defpackage.bzlv;
import defpackage.bzlw;
import defpackage.bzna;
import defpackage.chen;
import defpackage.chet;
import defpackage.cnvg;
import defpackage.conm;
import defpackage.coog;
import defpackage.ctsj;
import defpackage.ctvd;
import defpackage.ctvt;
import defpackage.elso;
import defpackage.ftga;
import defpackage.ftgf;
import defpackage.mmn;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ModuleInitializer extends IntentOperation {
    private static final String a = auua.f("com.google.android.gms.nearby");

    public static boolean a(Context context) {
        if (!ftga.be() || !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth") || !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || !d(context)) {
            return false;
        }
        if (!ftgf.a.lK().bp() && chen.k(context)) {
            return false;
        }
        ftga ftgaVar = ftga.a;
        if (!ftgaVar.lK().dl()) {
            chen.m(context);
        }
        if (!ftgaVar.lK().mo322do()) {
            int i = chen.a;
            if (chen.g(context, "android.permission.MANAGE_USERS")) {
                auto.a(context);
            }
        }
        return chen.i(context) && !b(context);
    }

    public static boolean b(Context context) {
        UserManager userManager;
        if (ftgf.a.lK().x() && auub.c() && (userManager = (UserManager) context.getSystemService("user")) != null) {
            return userManager.getUserRestrictions().getBoolean("no_bluetooth_sharing", false);
        }
        return false;
    }

    private final bzlv c() {
        return bzna.a(getApplicationContext(), "nearby", "nearbysharing:service:state", 0);
    }

    private static boolean d(Context context) {
        if (aury.d(context) || aury.g(context)) {
            return false;
        }
        if (aury.h(context)) {
            return ftga.bj();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && !"com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        coog.c();
        if (!Objects.equals(action, "android.intent.action.PACKAGE_DATA_CLEARED") && !Objects.equals(action, "android.intent.action.PACKAGE_ADDED") && !Objects.equals(action, "android.intent.action.PACKAGE_REPLACED")) {
            boolean a2 = a(this);
            cnvg.a(this);
            Intent intent2 = new Intent("com.google.android.gms.nearby.sharing.UPDATE_SYSTEM_COMPONENTS");
            intent2.putExtra("com.google.android.gms.nearby.sharing.EXTRA_PACKAGE_NAME", getPackageName());
            intent2.putExtra("com.google.android.gms.nearby.sharing.EXTRA_TILE_COMPONENT", "com.google.android.gms.nearby.sharing.SharingTileService");
            intent2.putExtra("com.google.android.gms.nearby.sharing.EXTRA_ENABLED", a2);
            sendBroadcast(intent2);
            if (a2) {
                conm.a.b().p("Runtime state initialization complete. Sharing is enabled.", new Object[0]);
                return;
            } else {
                conm.a.b().h("Runtime state initialization complete. Sharing is disabled for reason %s.", !ftga.be() ? "FLAG_DISABLED" : !getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? "MISSING_BLUETOOTH" : !getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") ? "MISSING_BLE" : !d(this) ? aury.d(this) ? "UNSUPPORTED_DEVICE_TYPE_CHROME_OS" : aury.g(this) ? "UNSUPPORTED_DEVICE_TYPE_THINGS" : (!ctvt.a(this) || ftga.bj() || ftga.bd()) ? "UNSUPPORTED_DEVICE_TYPE" : "UNSUPPORTED_DEVICE_TYPE_LATCHSKY" : b(this) ? "FILE_SHARING_BLOCKED" : !chen.i(this) ? "DISABLED_ON_NON_PRIMARY_PROFILE" : "UNKNOWN");
                return;
            }
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String schemeSpecificPart = data.getSchemeSpecificPart();
        if (ftga.aR().b.contains(schemeSpecificPart)) {
            chet chetVar = conm.a;
            chetVar.b().i("%s %s, Attempt to re-grant slice permission.", schemeSpecificPart, action);
            mmn a3 = mmn.a(this);
            try {
                if (ctvd.a(this, schemeSpecificPart) == 1) {
                    chetVar.e().h("Unable to grant slice read permissions to %s because it's not a trusted app. Skipping.", schemeSpecificPart);
                } else {
                    elso it = ctsj.h.iterator();
                    while (it.hasNext()) {
                        a3.d(schemeSpecificPart, (Uri) it.next());
                    }
                    chetVar.b().h("Granted slice and uri permissions to %s", schemeSpecificPart);
                }
            } catch (IllegalArgumentException | NullPointerException | SecurityException e) {
                conm.a.c().f(e).h("Failed to grant slice permission for %s", schemeSpecificPart);
            }
        }
        if ((!Objects.equals(action, "android.intent.action.PACKAGE_ADDED") && !Objects.equals(action, "android.intent.action.PACKAGE_REPLACED")) || coog.a(this) == null || bzlw.i(c(), "migration_acknowledged", false)) {
            return;
        }
        bzlt c = c().c();
        c.e("migration_acknowledged", false);
        bzlw.g(c);
    }
}
