package com.google.android.gms.udc.intentoperation;

import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UdcSystemAccountsChangedIntentOperation extends IntentOperation {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r17) {
        /*
            r16 = this;
            if (r17 != 0) goto L6
        L2:
            r6 = r16
            goto Ld2
        L6:
            java.lang.String r0 = r17.getAction()
            java.lang.String r1 = "android.accounts.LOGIN_ACCOUNTS_CHANGED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2
            djiq r1 = defpackage.djiq.a(r16)
            java.util.Set r0 = r1.e()
            java.util.Iterator r2 = r0.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2
            java.lang.Object r0 = r2.next()
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            android.content.SharedPreferences r5 = r1.b     // Catch: java.lang.Throwable -> L49
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L49
            r1.f()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = defpackage.djiq.b(r3)     // Catch: java.lang.Throwable -> L42
            int r0 = r5.getInt(r0, r4)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L42
            r6 = r16
            java.util.List r0 = defpackage.wkg.j(r6, r0, r3)     // Catch: java.lang.Throwable -> L4b
            goto L59
        L42:
            r0 = move-exception
            r6 = r16
        L45:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L47
            throw r0     // Catch: java.lang.Throwable -> L4b java.lang.Throwable -> L4b
        L47:
            r0 = move-exception
            goto L45
        L49:
            r6 = r16
        L4b:
            ausn r0 = defpackage.djim.a
            eltz r0 = r0.i()
            java.lang.String r5 = "Error getting account change events."
            r7 = 11803(0x2e1b, float:1.654E-41)
            defpackage.a.A(r0, r5, r7)
            r0 = 0
        L59:
            if (r0 == 0) goto L1e
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L1e
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.auth.AccountChangeEvent r0 = (com.google.android.gms.auth.AccountChangeEvent) r0
            int r5 = r0.e
            android.content.SharedPreferences r7 = r1.b
            monitor-enter(r7)
            r1.f()     // Catch: java.lang.Throwable -> Lcf
            android.content.SharedPreferences$Editor r8 = r7.edit()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r9 = defpackage.djiq.b(r3)     // Catch: java.lang.Throwable -> Lcf
            r8.putInt(r9, r5)     // Catch: java.lang.Throwable -> Lcf
            r8.apply()     // Catch: java.lang.Throwable -> Lcf
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lcf
            int r5 = r0.d
            r8 = 4
            if (r5 != r8) goto L1e
            java.lang.String r0 = r0.f
            monitor-enter(r7)
            boolean r5 = r1.g()     // Catch: java.lang.Throwable -> Lcc
            android.content.SharedPreferences$Editor r8 = r7.edit()     // Catch: java.lang.Throwable -> Lcc
            int[] r9 = defpackage.djiq.a     // Catch: java.lang.Throwable -> Lcc
        L90:
            r10 = 2
            if (r4 >= r10) goto Lc2
            r10 = r9[r4]     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r11 = defpackage.djiq.c(r3, r10)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r12 = defpackage.djiq.d(r3, r10)     // Catch: java.lang.Throwable -> Lcc
            boolean r13 = r7.getBoolean(r11, r5)     // Catch: java.lang.Throwable -> Lcc
            r14 = 0
            long r14 = r7.getLong(r12, r14)     // Catch: java.lang.Throwable -> Lcc
            r17 = r1
            java.lang.String r1 = defpackage.djiq.c(r0, r10)     // Catch: java.lang.Throwable -> Lcc
            r8.putBoolean(r1, r13)     // Catch: java.lang.Throwable -> Lcc
            r8.remove(r11)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r1 = defpackage.djiq.d(r0, r10)     // Catch: java.lang.Throwable -> Lcc
            r8.putLong(r1, r14)     // Catch: java.lang.Throwable -> Lcc
            r8.remove(r12)     // Catch: java.lang.Throwable -> Lcc
            int r4 = r4 + 1
            r1 = r17
            goto L90
        Lc2:
            r17 = r1
            r8.apply()     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lcc
            r1 = r17
            goto L1e
        Lcc:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lcc
            throw r0
        Lcf:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lcf
            throw r0
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.udc.intentoperation.UdcSystemAccountsChangedIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
