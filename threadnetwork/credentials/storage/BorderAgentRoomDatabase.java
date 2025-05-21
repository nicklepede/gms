package com.google.android.gms.threadnetwork.credentials.storage;

import android.content.Context;
import com.google.android.gms.threadnetwork.ThreadBorderAgent;
import com.google.android.gms.threadnetwork.ThreadNetworkCredentials;
import com.google.android.gms.threadnetwork.credentials.storage.BorderAgentRoomDatabase;
import defpackage.bqvy;
import defpackage.dfgm;
import defpackage.dfna;
import defpackage.dfnn;
import defpackage.dfnp;
import defpackage.dfnu;
import defpackage.dfod;
import defpackage.dfog;
import defpackage.dfoh;
import defpackage.dfoi;
import defpackage.dfoj;
import defpackage.dfok;
import defpackage.eitj;
import defpackage.ejtk;
import defpackage.fvaq;
import defpackage.kpe;
import defpackage.kpm;
import defpackage.ksa;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public abstract class BorderAgentRoomDatabase extends kpm implements dfnn {
    private static BorderAgentRoomDatabase l;

    public static synchronized BorderAgentRoomDatabase w(Context context) {
        BorderAgentRoomDatabase borderAgentRoomDatabase;
        synchronized (BorderAgentRoomDatabase.class) {
            if (l == null) {
                kpe a = bqvy.a(context, BorderAgentRoomDatabase.class, "thread_border_agent_database");
                a.f();
                a.b(new dfog(), new dfoh(), new dfoi(), new dfoj(), new dfok());
                l = (BorderAgentRoomDatabase) a.a();
            }
            borderAgentRoomDatabase = l;
        }
        return borderAgentRoomDatabase;
    }

    private final synchronized void y(final dfnp dfnpVar, final String str, final String str2, final byte[] bArr, final byte[] bArr2, final dfgm dfgmVar, final long j, final long j2, final String str3, final String str4) {
        I(new Runnable() { // from class: dfnq
            @Override // java.lang.Runnable
            public final void run() {
                BorderAgentRoomDatabase borderAgentRoomDatabase = BorderAgentRoomDatabase.this;
                dfnp dfnpVar2 = dfnpVar;
                if (dfnpVar2 != null) {
                    borderAgentRoomDatabase.x(dfnpVar2);
                }
                dfgm dfgmVar2 = dfgmVar;
                dfnp g = borderAgentRoomDatabase.g(dfgmVar2);
                boolean z = true;
                if (g != null && !Arrays.equals(bArr, g.b.b())) {
                    z = false;
                }
                String str5 = str4;
                String str6 = str3;
                long j3 = j2;
                long j4 = j;
                byte[] bArr3 = bArr2;
                String str7 = str2;
                borderAgentRoomDatabase.v().c(new dfnu(str, str7, bArr3, dfgmVar2, z, j4, j3, 0L, str6, str5));
            }
        });
    }

    private static final List z(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dfnp d = dfnp.d((dfnu) it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    @Override // defpackage.dfnn
    public final dfnp b(ThreadBorderAgent threadBorderAgent) {
        final String n = ejtk.f.n(threadBorderAgent.a());
        dfnu dfnuVar = (dfnu) ksa.a(v().a, true, false, new fvaq() { // from class: dfnj
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [dfnu] */
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                kri a = ((kqz) obj).a("SELECT * FROM border_agent_table WHERE id=? LIMIT 1");
                boolean z = true;
                try {
                    a.h(1, n);
                    int b = kse.b(a, "id");
                    int b2 = kse.b(a, "owner_package");
                    int b3 = kse.b(a, "encrypted_active_dataset");
                    int b4 = kse.b(a, "scope_id");
                    int b5 = kse.b(a, "is_preferred");
                    int b6 = kse.b(a, "updated_at");
                    int b7 = kse.b(a, "created_at");
                    int b8 = kse.b(a, "uploaded_at");
                    int b9 = kse.b(a, "owner_account_type");
                    int b10 = kse.b(a, "owner_account_name");
                    if (a.k()) {
                        String d = a.j(b) ? null : a.d(b);
                        String d2 = a.j(b2) ? null : a.d(b2);
                        byte[] l2 = a.j(b3) ? null : a.l(b3);
                        dfgm dfgmVar = new dfgm(a.j(b4) ? null : a.l(b4));
                        if (((int) a.b(b5)) == 0) {
                            z = false;
                        }
                        r14 = new dfnu(d, d2, l2, dfgmVar, z, a.b(b6), a.b(b7), a.b(b8), a.j(b9) ? null : a.d(b9), a.j(b10) ? null : a.d(b10));
                    }
                    return r14;
                } finally {
                    a.close();
                }
            }
        });
        if (dfnuVar == null) {
            return null;
        }
        return dfnp.d(dfnuVar);
    }

    @Override // defpackage.dfnn
    public final dfnp d(byte[] bArr, final dfgm dfgmVar) {
        for (dfnp dfnpVar : z(dfgmVar == null ? v().a() : (List) ksa.a(v().a, true, false, new fvaq() { // from class: dfni
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                kri a = ((kqz) obj).a("SELECT * FROM border_agent_table WHERE scope_id=? ORDER BY updated_at DESC");
                try {
                    byte[] b = dfgm.this.b();
                    if (b == null) {
                        a.g(1);
                    } else {
                        a.e(1, b);
                    }
                    int b2 = kse.b(a, "id");
                    int b3 = kse.b(a, "owner_package");
                    int b4 = kse.b(a, "encrypted_active_dataset");
                    int b5 = kse.b(a, "scope_id");
                    int b6 = kse.b(a, "is_preferred");
                    int b7 = kse.b(a, "updated_at");
                    int b8 = kse.b(a, "created_at");
                    int b9 = kse.b(a, "uploaded_at");
                    int b10 = kse.b(a, "owner_account_type");
                    int b11 = kse.b(a, "owner_account_name");
                    ArrayList arrayList = new ArrayList();
                    while (a.k()) {
                        arrayList.add(new dfnu(a.j(b2) ? null : a.d(b2), a.j(b3) ? null : a.d(b3), a.j(b4) ? null : a.l(b4), new dfgm(a.j(b5) ? null : a.l(b5)), ((int) a.b(b6)) != 0, a.b(b7), a.b(b8), a.b(b9), a.j(b10) ? null : a.d(b10), a.j(b11) ? null : a.d(b11)));
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }))) {
            if (Arrays.equals(bArr, dfnpVar.b.b())) {
                return dfnpVar;
            }
        }
        return null;
    }

    @Override // defpackage.dfnn
    public final dfnp g(dfgm dfgmVar) {
        Iterator it = v().b(dfgmVar).iterator();
        while (it.hasNext()) {
            dfnp d = dfnp.d((dfnu) it.next());
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    @Override // defpackage.dfnn
    public final eitj h() {
        return eitj.i(z(v().a()));
    }

    @Override // defpackage.dfnn
    public final eitj i(final String str) {
        return eitj.i(z((List) ksa.a(v().a, true, false, new fvaq() { // from class: dfnf
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                kri a = ((kqz) obj).a("SELECT * FROM border_agent_table WHERE owner_package=? ORDER BY updated_at DESC");
                String str2 = str;
                try {
                    if (str2 == null) {
                        a.g(1);
                    } else {
                        a.h(1, str2);
                    }
                    int b = kse.b(a, "id");
                    int b2 = kse.b(a, "owner_package");
                    int b3 = kse.b(a, "encrypted_active_dataset");
                    int b4 = kse.b(a, "scope_id");
                    int b5 = kse.b(a, "is_preferred");
                    int b6 = kse.b(a, "updated_at");
                    int b7 = kse.b(a, "created_at");
                    int b8 = kse.b(a, "uploaded_at");
                    int b9 = kse.b(a, "owner_account_type");
                    int b10 = kse.b(a, "owner_account_name");
                    ArrayList arrayList = new ArrayList();
                    while (a.k()) {
                        arrayList.add(new dfnu(a.j(b) ? null : a.d(b), a.j(b2) ? null : a.d(b2), a.j(b3) ? null : a.l(b3), new dfgm(a.j(b4) ? null : a.l(b4)), ((int) a.b(b5)) != 0, a.b(b6), a.b(b7), a.b(b8), a.j(b9) ? null : a.d(b9), a.j(b10) ? null : a.d(b10)));
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        })));
    }

    @Override // defpackage.dfnn
    public final eitj j(dfgm dfgmVar) {
        return eitj.i(z(v().b(dfgmVar)));
    }

    @Override // defpackage.dfnn
    public final /* synthetic */ void l(ThreadBorderAgent threadBorderAgent, String str, ThreadNetworkCredentials threadNetworkCredentials, dfgm dfgmVar) {
        m(threadBorderAgent, str, threadNetworkCredentials, dfgmVar, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (defpackage.dfgn.b(r1, r2.b, true) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r18.equals(r2.k()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r7.equals(r2.c()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        return;
     */
    @Override // defpackage.dfnn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m(com.google.android.gms.threadnetwork.ThreadBorderAgent r17, final java.lang.String r18, com.google.android.gms.threadnetwork.ThreadNetworkCredentials r19, defpackage.dfgm r20, java.lang.String r21, java.lang.String r22) {
        /*
            r16 = this;
            r4 = r18
            monitor-enter(r16)
            dfnp r2 = r16.b(r17)     // Catch: java.lang.Throwable -> Lba
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto L13
            long r0 = r2.a()     // Catch: java.lang.Throwable -> Lba
            r10 = r0
            goto L14
        L13:
            r10 = r8
        L14:
            fsmf r0 = defpackage.fsmf.a     // Catch: java.lang.Throwable -> Lba
            fsmg r0 = r0.a()     // Catch: java.lang.Throwable -> Lba
            long r0 = r0.c()     // Catch: java.lang.Throwable -> Lba
            fsmf r3 = defpackage.fsmf.a     // Catch: java.lang.Throwable -> Lba
            fsmg r3 = r3.a()     // Catch: java.lang.Throwable -> Lba
            long r5 = r3.d()     // Catch: java.lang.Throwable -> Lba
            r3 = 1
            if (r2 != 0) goto L6f
            dfna r7 = r16.v()     // Catch: java.lang.Throwable -> Lba
            kpm r7 = r7.a     // Catch: java.lang.Throwable -> Lba
            dfnc r12 = new dfnc     // Catch: java.lang.Throwable -> Lba
            r12.<init>()     // Catch: java.lang.Throwable -> Lba
            r13 = 0
            java.lang.Object r7 = defpackage.ksa.a(r7, r3, r13, r12)     // Catch: java.lang.Throwable -> Lba
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> Lba
            long r14 = r7.longValue()     // Catch: java.lang.Throwable -> Lba
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 >= 0) goto L5f
            dfna r5 = r16.v()     // Catch: java.lang.Throwable -> Lba
            kpm r5 = r5.a     // Catch: java.lang.Throwable -> Lba
            dfnk r6 = new dfnk     // Catch: java.lang.Throwable -> Lba
            r6.<init>()     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r5 = defpackage.ksa.a(r5, r3, r13, r6)     // Catch: java.lang.Throwable -> Lba
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> Lba
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> Lba
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5f
            goto L6f
        L5f:
            dfnm r0 = new dfnm     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lba
            r1[r13] = r4     // Catch: java.lang.Throwable -> Lba
            java.lang.String r2 = "Max storage size is exceeded for records of %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch: java.lang.Throwable -> Lba
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lba
            throw r0     // Catch: java.lang.Throwable -> Lba
        L6f:
            if (r2 == 0) goto L93
            com.google.android.gms.threadnetwork.ThreadNetworkCredentials r0 = r2.b     // Catch: java.lang.Throwable -> Lba
            r1 = r19
            boolean r0 = defpackage.dfgn.b(r1, r0, r3)     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto L95
            java.lang.String r0 = r2.k()     // Catch: java.lang.Throwable -> Lba
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto L95
            dfgm r0 = r2.c()     // Catch: java.lang.Throwable -> Lba
            r7 = r20
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> Lba
            if (r0 == 0) goto L97
            monitor-exit(r16)
            return
        L93:
            r1 = r19
        L95:
            r7 = r20
        L97:
            byte[] r0 = r17.a()     // Catch: java.lang.Throwable -> Lba
            int r3 = defpackage.dfnp.c     // Catch: java.lang.Throwable -> Lba
            ejtk r3 = defpackage.ejtk.f     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = r3.n(r0)     // Catch: java.lang.Throwable -> Lba
            byte[] r5 = r1.b()     // Catch: java.lang.Throwable -> Lba
            byte[] r0 = r1.a()     // Catch: java.lang.Throwable -> Lba
            byte[] r6 = defpackage.dfnp.m(r0, r3)     // Catch: java.lang.Throwable -> Lba
            r1 = r16
            r12 = r21
            r13 = r22
            r1.y(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r16)
            return
        Lba:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> Lba
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.threadnetwork.credentials.storage.BorderAgentRoomDatabase.m(com.google.android.gms.threadnetwork.ThreadBorderAgent, java.lang.String, com.google.android.gms.threadnetwork.ThreadNetworkCredentials, dfgm, java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.dfnn
    public final void n() {
        k();
    }

    @Override // defpackage.dfnn
    public final synchronized void o(dfnp dfnpVar, Instant instant) {
        kpm kpmVar = v().a;
        final String h = dfnpVar.h();
        final long epochMilli = instant.toEpochMilli();
        ksa.a(kpmVar, false, true, new fvaq() { // from class: dfnb
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                kri a = ((kqz) obj).a("UPDATE border_agent_table SET uploaded_at=? WHERE id=?");
                try {
                    a.f(1, epochMilli);
                    String str = h;
                    if (str == null) {
                        a.g(2);
                    } else {
                        a.h(2, str);
                    }
                    a.k();
                    a.close();
                    return null;
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.dfnn
    public final synchronized void p(dfnp dfnpVar, dfgm dfgmVar) {
        dfnu dfnuVar = dfnpVar.a;
        y(dfnpVar, dfnpVar.h(), dfnpVar.k(), dfnpVar.b.b(), dfnuVar.c, dfgmVar, dfnpVar.b(), dfnpVar.a(), dfnpVar.j(), dfnpVar.i());
    }

    @Override // defpackage.dfnn
    public final synchronized void q(ThreadBorderAgent threadBorderAgent) {
        dfnp b = b(threadBorderAgent);
        if (b == null) {
            return;
        }
        x(b);
    }

    public abstract dfna v();

    public final synchronized void x(dfnp dfnpVar) {
        eitj j = j(dfnpVar.c());
        dfna v = v();
        final String h = dfnpVar.h();
        ksa.a(v.a, false, true, new fvaq() { // from class: dfne
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                kri a = ((kqz) obj).a("DELETE FROM border_agent_table WHERE id=?");
                String str = h;
                try {
                    if (str == null) {
                        a.g(1);
                    } else {
                        a.h(1, str);
                    }
                    a.k();
                    a.close();
                    return null;
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
        });
        if (j.size() == 1 && ((dfnp) j.get(0)).h().equals(dfnpVar.h())) {
            String concat = String.valueOf(dfnpVar.h()).concat("/removed");
            try {
                v().c(new dfnu(concat, dfnpVar.k(), dfnp.m(dfnpVar.b.a(), concat), dfnpVar.c(), dfnpVar.l(), dfnpVar.b(), dfnpVar.a(), dfnpVar.g().toEpochMilli(), dfnpVar.j(), dfnpVar.i()));
            } catch (dfod e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
