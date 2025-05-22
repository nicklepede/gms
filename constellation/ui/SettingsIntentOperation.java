package com.google.android.gms.constellation.ui;

import defpackage.apzq;
import defpackage.auad;
import defpackage.avqf;
import defpackage.avqj;
import defpackage.avqp;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SettingsIntentOperation extends apzq {
    private static final auad a = avqj.a("settings_operation");
    private final avqp b = avqp.t(new avqf(UUID.randomUUID().toString()));

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r0 == 0) goto L11;
     */
    @Override // defpackage.apzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a() {
        /*
            r11 = this;
            android.content.Context r0 = r11.getBaseContext()
            android.content.Context r1 = r0.getApplicationContext()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = defpackage.fpen.f()
            r3 = 0
            if (r0 == 0) goto L59
            avqp r0 = r11.b     // Catch: java.lang.SecurityException -> L29
            int r0 = r0.f()     // Catch: java.lang.SecurityException -> L29
            fpen r4 = defpackage.fpen.a     // Catch: java.lang.SecurityException -> L29
            fpeo r4 = r4.lK()     // Catch: java.lang.SecurityException -> L29
            boolean r4 = r4.g()     // Catch: java.lang.SecurityException -> L29
            if (r4 == 0) goto L33
            if (r0 == 0) goto L59
            goto L33
        L29:
            r0 = move-exception
            auad r4 = com.google.android.gms.constellation.ui.SettingsIntentOperation.a
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "Error fetching subscription count"
            r4.g(r6, r0, r5)
        L33:
            auad r0 = com.google.android.gms.constellation.ui.SettingsIntentOperation.a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "Displaying device-level Phone Number Verification consent options"
            r0.j(r5, r4)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r4 = "com.google.android.gms.constellation.ui.ConstellationConsentSettingActivity"
            android.content.Intent r6 = r0.setClassName(r1, r4)
            aqlc r9 = defpackage.aqlc.CONSTELLATION_ITEM
            com.google.android.gms.libs.googlesettings.GoogleSettingsItem r5 = new com.google.android.gms.libs.googlesettings.GoogleSettingsItem
            r8 = 2132083972(0x7f150504, float:1.9808101E38)
            auiq r10 = defpackage.auri.b(r11)
            r7 = 5
            r5.<init>(r6, r7, r8, r9, r10)
            r2.add(r5)
        L59:
            boolean r0 = defpackage.fpen.e()
            if (r0 == 0) goto L85
            auad r0 = com.google.android.gms.constellation.ui.SettingsIntentOperation.a
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "Displaying settings"
            r0.j(r5, r4)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r4 = "com.google.android.gms.constellation.ui.ConstellationDebugActivity"
            android.content.Intent r6 = r0.setClassName(r1, r4)
            aqlc r9 = defpackage.aqlc.CONSTELLATION_DEBUG_ITEM
            com.google.android.gms.libs.googlesettings.GoogleSettingsItem r5 = new com.google.android.gms.libs.googlesettings.GoogleSettingsItem
            r8 = 2132083970(0x7f150502, float:1.9808097E38)
            auiq r10 = defpackage.auri.b(r11)
            r7 = 2
            r5.<init>(r6, r7, r8, r9, r10)
            r2.add(r5)
        L85:
            int r0 = r2.size()
        L89:
            if (r3 >= r0) goto L9d
            java.lang.Object r1 = r2.get(r3)
            com.google.android.gms.libs.googlesettings.GoogleSettingsItem r1 = (com.google.android.gms.libs.googlesettings.GoogleSettingsItem) r1
            r4 = 2132084014(0x7f15052e, float:1.9808187E38)
            java.lang.String r4 = r11.getString(r4)
            r1.p = r4
            int r3 = r3 + 1
            goto L89
        L9d:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto La5
            r0 = 0
            return r0
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.constellation.ui.SettingsIntentOperation.a():java.util.List");
    }
}
