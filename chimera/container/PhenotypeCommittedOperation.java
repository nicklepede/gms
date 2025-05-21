package com.google.android.gms.chimera.container;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.chimera.container.boundservice.GmsProvidenceMigrationBroadcastReceiver;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.anya;
import defpackage.asng;
import defpackage.asqg;
import defpackage.eiuu;
import defpackage.ejfg;
import defpackage.fmqj;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhenotypeCommittedOperation extends anya {
    static final String a = asqg.f("com.google.android.gms");
    public static final /* synthetic */ int b = 0;
    private static final String c = "PhenotypeCommittedOperation";

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class PhenotypeCommitUpdateReceiver extends TracingBroadcastReceiver {
        public PhenotypeCommitUpdateReceiver() {
            super("container");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            PhenotypeCommittedOperation.e(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.content.Context r8) {
        /*
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r0 = defpackage.asqg.e(r0)
            java.lang.String r1 = "direct_boot:"
            boolean r1 = r0.startsWith(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            r1 = 12
            java.lang.String r0 = r0.substring(r1)
            boolean r1 = defpackage.dnnr.j()
            if (r1 == 0) goto L1e
            r1 = r2
            goto L1f
        L1e:
            r1 = r3
        L1f:
            android.content.SharedPreferences r3 = r8.getSharedPreferences(r0, r3)
            long r3 = f(r3)
            r5 = 4
            android.content.SharedPreferences r6 = r8.getSharedPreferences(r0, r5)
            long r6 = f(r6)
            if (r1 == 0) goto L39
            android.content.Context r1 = defpackage.dnnr.a(r8)
            r1.getSharedPreferences(r0, r5)
        L39:
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 != 0) goto L43
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L4f
        L43:
            defpackage.dvno.c()
            boolean r8 = defpackage.aoah.l(r8)
            if (r8 == 0) goto L4f
            defpackage.aoah.h(r2)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.container.PhenotypeCommittedOperation.e(android.content.Context):void");
    }

    private static long f(SharedPreferences sharedPreferences) {
        return sharedPreferences.getLong("__phenotype_configuration_version", 0L);
    }

    private final void g() {
        int componentEnabledSetting;
        boolean i = fmqj.a.a().i();
        eiuu G = eiuu.G(fmqj.a.a().b().b);
        ejfg listIterator = GmsProvidenceMigrationBroadcastReceiver.a.entrySet().listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            boolean z2 = true;
            boolean z3 = !i || G.contains(entry.getKey());
            ComponentName componentName = new ComponentName(this, (String) entry.getValue());
            try {
                componentEnabledSetting = getPackageManager().getComponentEnabledSetting(componentName);
            } catch (IllegalArgumentException e) {
                Log.w(c, "Cannot get component-enabled-setting: ".concat(e.toString()));
            }
            if (!z3 || componentEnabledSetting != 1) {
                if (z3 || componentEnabledSetting != 2) {
                    try {
                        asng.J(this, componentName.getClassName(), true == z3 ? 1 : 2);
                    } catch (IllegalArgumentException e2) {
                        Log.w(c, "Cannot set component-enabled-setting: ".concat(e2.toString()));
                    }
                    z |= z2;
                }
            }
            z2 = false;
            z |= z2;
        }
        if (z) {
            sendBroadcast(new Intent("com.google.android.gms.core.PROVIDENCE_MIGRATION_UPDATE").setPackage(getPackageName()));
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        g();
    }

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        boolean z = false;
        if (a.equals(action) && "com.google.android.gms".equals(stringExtra)) {
            z = true;
        }
        if (z) {
            sendBroadcast(new Intent("com.google.android.gms.chimera.CORE_FLAGS_UPDATED").setPackage(getPackageName()));
        }
        if (fmqj.e()) {
            if (z) {
                g();
            } else {
                super.onHandleIntent(intent);
            }
        }
    }
}
