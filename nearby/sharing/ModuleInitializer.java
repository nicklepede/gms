package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.UserManager;
import com.google.android.chimera.IntentOperation;
import defpackage.asoe;
import defpackage.aspu;
import defpackage.asqg;
import defpackage.asqh;
import defpackage.bxdd;
import defpackage.bxdf;
import defpackage.bxdg;
import defpackage.bxek;
import defpackage.cexc;
import defpackage.cexi;
import defpackage.clmy;
import defpackage.cmfe;
import defpackage.cmfy;
import defpackage.crjf;
import defpackage.crly;
import defpackage.crmo;
import defpackage.ejfh;
import defpackage.fqmf;
import defpackage.fqmk;
import defpackage.kts;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ModuleInitializer extends IntentOperation {
    private static final String a = asqg.f("com.google.android.gms.nearby");

    public static boolean a(Context context) {
        if (!fqmf.bd() || !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth") || !context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || !d(context)) {
            return false;
        }
        if (!fqmk.a.a().bt() && cexc.j(context)) {
            return false;
        }
        if (!fqmf.a.a().di()) {
            cexc.l(context);
        }
        if (!fqmf.a.a().dl()) {
            int i = cexc.a;
            if (cexc.f(context, "android.permission.MANAGE_USERS")) {
                aspu.a(context);
            }
        }
        return cexc.h(context) && !b(context);
    }

    public static boolean b(Context context) {
        UserManager userManager;
        if (fqmk.a.a().x() && asqh.c() && (userManager = (UserManager) context.getSystemService("user")) != null) {
            return userManager.getUserRestrictions().getBoolean("no_bluetooth_sharing", false);
        }
        return false;
    }

    private final bxdf c() {
        return bxek.a(getApplicationContext(), "nearby", "nearbysharing:service:state", 0);
    }

    private static boolean d(Context context) {
        if (asoe.d(context) || asoe.g(context)) {
            return false;
        }
        if (asoe.h(context)) {
            return fqmf.bi();
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
        cmfy.c();
        if (!Objects.equals(action, "android.intent.action.PACKAGE_DATA_CLEARED") && !Objects.equals(action, "android.intent.action.PACKAGE_ADDED") && !Objects.equals(action, "android.intent.action.PACKAGE_REPLACED")) {
            boolean a2 = a(this);
            clmy.a(this);
            Intent intent2 = new Intent("com.google.android.gms.nearby.sharing.UPDATE_SYSTEM_COMPONENTS");
            intent2.putExtra("com.google.android.gms.nearby.sharing.EXTRA_PACKAGE_NAME", getPackageName());
            intent2.putExtra("com.google.android.gms.nearby.sharing.EXTRA_TILE_COMPONENT", "com.google.android.gms.nearby.sharing.SharingTileService");
            intent2.putExtra("com.google.android.gms.nearby.sharing.EXTRA_ENABLED", a2);
            sendBroadcast(intent2);
            if (a2) {
                cmfe.a.b().p("Runtime state initialization complete. Sharing is enabled.", new Object[0]);
                return;
            } else {
                cmfe.a.b().h("Runtime state initialization complete. Sharing is disabled for reason %s.", !fqmf.bd() ? "FLAG_DISABLED" : !getPackageManager().hasSystemFeature("android.hardware.bluetooth") ? "MISSING_BLUETOOTH" : !getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") ? "MISSING_BLE" : !d(this) ? asoe.d(this) ? "UNSUPPORTED_DEVICE_TYPE_CHROME_OS" : asoe.g(this) ? "UNSUPPORTED_DEVICE_TYPE_THINGS" : (!crmo.a(this) || fqmf.bi() || fqmf.bc()) ? "UNSUPPORTED_DEVICE_TYPE" : "UNSUPPORTED_DEVICE_TYPE_LATCHSKY" : b(this) ? "FILE_SHARING_BLOCKED" : !cexc.h(this) ? "DISABLED_ON_NON_PRIMARY_PROFILE" : "UNKNOWN");
                return;
            }
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String schemeSpecificPart = data.getSchemeSpecificPart();
        if (fqmf.aQ().b.contains(schemeSpecificPart)) {
            cexi cexiVar = cmfe.a;
            cexiVar.b().i("%s %s, Attempt to re-grant slice permission.", schemeSpecificPart, action);
            kts a3 = kts.a(this);
            try {
                if (crly.a(this, schemeSpecificPart) == 1) {
                    cexiVar.e().h("Unable to grant slice read permissions to %s because it's not a trusted app. Skipping.", schemeSpecificPart);
                } else {
                    ejfh it = crjf.h.iterator();
                    while (it.hasNext()) {
                        a3.d(schemeSpecificPart, (Uri) it.next());
                    }
                    cmfe.a.b().h("Granted slice and uri permissions to %s", schemeSpecificPart);
                }
            } catch (IllegalArgumentException | NullPointerException | SecurityException e) {
                cmfe.a.c().f(e).h("Failed to grant slice permission for %s", schemeSpecificPart);
            }
        }
        if ((!Objects.equals(action, "android.intent.action.PACKAGE_ADDED") && !Objects.equals(action, "android.intent.action.PACKAGE_REPLACED")) || cmfy.a(this) == null || bxdg.i(c(), "migration_acknowledged", false)) {
            return;
        }
        bxdd c = c().c();
        c.e("migration_acknowledged", false);
        bxdg.g(c);
    }
}
