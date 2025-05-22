package com.google.android.gms.threadnetwork.credentials.storage;

import android.content.Context;
import com.google.android.gms.threadnetwork.ThreadBorderAgent;
import com.google.android.gms.threadnetwork.ThreadNetworkCredentials;
import com.google.android.gms.threadnetwork.credentials.storage.BorderAgentRoomDatabase;
import defpackage.btdp;
import defpackage.dhru;
import defpackage.dhye;
import defpackage.dhyr;
import defpackage.dhyt;
import defpackage.dhyy;
import defpackage.dhzh;
import defpackage.dhzk;
import defpackage.dhzl;
import defpackage.dhzm;
import defpackage.dhzn;
import defpackage.dhzo;
import defpackage.elgo;
import defpackage.emgt;
import defpackage.fxwo;
import defpackage.mhp;
import defpackage.mhx;
import defpackage.mkv;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public abstract class BorderAgentRoomDatabase extends mhx implements dhyr {
    private static BorderAgentRoomDatabase m;

    public static synchronized BorderAgentRoomDatabase w(Context context) {
        BorderAgentRoomDatabase borderAgentRoomDatabase;
        synchronized (BorderAgentRoomDatabase.class) {
            if (m == null) {
                mhp a = btdp.a(context, BorderAgentRoomDatabase.class, "thread_border_agent_database");
                a.f();
                a.b(new dhzk(), new dhzl(), new dhzm(), new dhzn(), new dhzo());
                m = (BorderAgentRoomDatabase) a.a();
            }
            borderAgentRoomDatabase = m;
        }
        return borderAgentRoomDatabase;
    }

    private final synchronized void y(final dhyt dhytVar, final String str, final String str2, final byte[] bArr, final byte[] bArr2, final dhru dhruVar, final long j, final long j2, final String str3, final String str4) {
        I(new Runnable() { // from class: dhyu
            @Override // java.lang.Runnable
            public final void run() {
                BorderAgentRoomDatabase borderAgentRoomDatabase = BorderAgentRoomDatabase.this;
                dhyt dhytVar2 = dhytVar;
                if (dhytVar2 != null) {
                    borderAgentRoomDatabase.x(dhytVar2);
                }
                dhru dhruVar2 = dhruVar;
                dhyt g = borderAgentRoomDatabase.g(dhruVar2);
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
                borderAgentRoomDatabase.v().c(new dhyy(str, str7, bArr3, dhruVar2, z, j4, j3, 0L, str6, str5));
            }
        });
    }

    private static final List z(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dhyt d = dhyt.d((dhyy) it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    @Override // defpackage.dhyr
    public final dhyt b(ThreadBorderAgent threadBorderAgent) {
        final String n = emgt.f.n(threadBorderAgent.a());
        dhyy dhyyVar = (dhyy) mkv.a(v().a, true, false, new fxwo() { // from class: dhyn
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0, types: [dhyy] */
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                mjx a = ((mjo) obj).a("SELECT * FROM border_agent_table WHERE id=? LIMIT 1");
                boolean z = true;
                try {
                    a.h(1, n);
                    int b = mkz.b(a, "id");
                    int b2 = mkz.b(a, "owner_package");
                    int b3 = mkz.b(a, "encrypted_active_dataset");
                    int b4 = mkz.b(a, "scope_id");
                    int b5 = mkz.b(a, "is_preferred");
                    int b6 = mkz.b(a, "updated_at");
                    int b7 = mkz.b(a, "created_at");
                    int b8 = mkz.b(a, "uploaded_at");
                    int b9 = mkz.b(a, "owner_account_type");
                    int b10 = mkz.b(a, "owner_account_name");
                    if (a.k()) {
                        String d = a.j(b) ? null : a.d(b);
                        String d2 = a.j(b2) ? null : a.d(b2);
                        byte[] l = a.j(b3) ? null : a.l(b3);
                        dhru dhruVar = new dhru(a.j(b4) ? null : a.l(b4));
                        if (((int) a.b(b5)) == 0) {
                            z = false;
                        }
                        r14 = new dhyy(d, d2, l, dhruVar, z, a.b(b6), a.b(b7), a.b(b8), a.j(b9) ? null : a.d(b9), a.j(b10) ? null : a.d(b10));
                    }
                    return r14;
                } finally {
                    a.close();
                }
            }
        });
        if (dhyyVar == null) {
            return null;
        }
        return dhyt.d(dhyyVar);
    }

    @Override // defpackage.dhyr
    public final dhyt d(byte[] bArr, final dhru dhruVar) {
        for (dhyt dhytVar : z(dhruVar == null ? v().a() : (List) mkv.a(v().a, true, false, new fxwo() { // from class: dhym
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                mjx a = ((mjo) obj).a("SELECT * FROM border_agent_table WHERE scope_id=? ORDER BY updated_at DESC");
                try {
                    byte[] b = dhru.this.b();
                    if (b == null) {
                        a.g(1);
                    } else {
                        a.e(1, b);
                    }
                    int b2 = mkz.b(a, "id");
                    int b3 = mkz.b(a, "owner_package");
                    int b4 = mkz.b(a, "encrypted_active_dataset");
                    int b5 = mkz.b(a, "scope_id");
                    int b6 = mkz.b(a, "is_preferred");
                    int b7 = mkz.b(a, "updated_at");
                    int b8 = mkz.b(a, "created_at");
                    int b9 = mkz.b(a, "uploaded_at");
                    int b10 = mkz.b(a, "owner_account_type");
                    int b11 = mkz.b(a, "owner_account_name");
                    ArrayList arrayList = new ArrayList();
                    while (a.k()) {
                        arrayList.add(new dhyy(a.j(b2) ? null : a.d(b2), a.j(b3) ? null : a.d(b3), a.j(b4) ? null : a.l(b4), new dhru(a.j(b5) ? null : a.l(b5)), ((int) a.b(b6)) != 0, a.b(b7), a.b(b8), a.b(b9), a.j(b10) ? null : a.d(b10), a.j(b11) ? null : a.d(b11)));
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        }))) {
            if (Arrays.equals(bArr, dhytVar.b.b())) {
                return dhytVar;
            }
        }
        return null;
    }

    @Override // defpackage.dhyr
    public final dhyt g(dhru dhruVar) {
        Iterator it = v().b(dhruVar).iterator();
        while (it.hasNext()) {
            dhyt d = dhyt.d((dhyy) it.next());
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    @Override // defpackage.dhyr
    public final elgo h() {
        return elgo.i(z(v().a()));
    }

    @Override // defpackage.dhyr
    public final elgo i(final String str) {
        return elgo.i(z((List) mkv.a(v().a, true, false, new fxwo() { // from class: dhyj
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                mjx a = ((mjo) obj).a("SELECT * FROM border_agent_table WHERE owner_package=? ORDER BY updated_at DESC");
                String str2 = str;
                try {
                    if (str2 == null) {
                        a.g(1);
                    } else {
                        a.h(1, str2);
                    }
                    int b = mkz.b(a, "id");
                    int b2 = mkz.b(a, "owner_package");
                    int b3 = mkz.b(a, "encrypted_active_dataset");
                    int b4 = mkz.b(a, "scope_id");
                    int b5 = mkz.b(a, "is_preferred");
                    int b6 = mkz.b(a, "updated_at");
                    int b7 = mkz.b(a, "created_at");
                    int b8 = mkz.b(a, "uploaded_at");
                    int b9 = mkz.b(a, "owner_account_type");
                    int b10 = mkz.b(a, "owner_account_name");
                    ArrayList arrayList = new ArrayList();
                    while (a.k()) {
                        arrayList.add(new dhyy(a.j(b) ? null : a.d(b), a.j(b2) ? null : a.d(b2), a.j(b3) ? null : a.l(b3), new dhru(a.j(b4) ? null : a.l(b4)), ((int) a.b(b5)) != 0, a.b(b6), a.b(b7), a.b(b8), a.j(b9) ? null : a.d(b9), a.j(b10) ? null : a.d(b10)));
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        })));
    }

    @Override // defpackage.dhyr
    public final elgo j(dhru dhruVar) {
        return elgo.i(z(v().b(dhruVar)));
    }

    @Override // defpackage.dhyr
    public final /* synthetic */ void l(ThreadBorderAgent threadBorderAgent, String str, ThreadNetworkCredentials threadNetworkCredentials, dhru dhruVar) {
        m(threadBorderAgent, str, threadNetworkCredentials, dhruVar, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        r1 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        if (defpackage.dhrv.a(r1, r2.b, true) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r18.equals(r2.k()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r7.equals(r2.c()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return;
     */
    @Override // defpackage.dhyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m(com.google.android.gms.threadnetwork.ThreadBorderAgent r17, final java.lang.String r18, com.google.android.gms.threadnetwork.ThreadNetworkCredentials r19, defpackage.dhru r20, java.lang.String r21, java.lang.String r22) {
        /*
            r16 = this;
            r4 = r18
            monitor-enter(r16)
            dhyt r2 = r16.b(r17)     // Catch: java.lang.Throwable -> Lb8
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L13
            long r0 = r2.a()     // Catch: java.lang.Throwable -> Lb8
            r10 = r0
            goto L14
        L13:
            r10 = r8
        L14:
            fvhn r0 = defpackage.fvhn.a     // Catch: java.lang.Throwable -> Lb8
            fvho r1 = r0.lK()     // Catch: java.lang.Throwable -> Lb8
            long r5 = r1.c()     // Catch: java.lang.Throwable -> Lb8
            fvho r0 = r0.lK()     // Catch: java.lang.Throwable -> Lb8
            long r0 = r0.d()     // Catch: java.lang.Throwable -> Lb8
            r3 = 1
            if (r2 != 0) goto L6d
            dhye r7 = r16.v()     // Catch: java.lang.Throwable -> Lb8
            mhx r7 = r7.a     // Catch: java.lang.Throwable -> Lb8
            dhyg r12 = new dhyg     // Catch: java.lang.Throwable -> Lb8
            r12.<init>()     // Catch: java.lang.Throwable -> Lb8
            r13 = 0
            java.lang.Object r7 = defpackage.mkv.a(r7, r3, r13, r12)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Long r7 = (java.lang.Long) r7     // Catch: java.lang.Throwable -> Lb8
            long r14 = r7.longValue()     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5d
            dhye r0 = r16.v()     // Catch: java.lang.Throwable -> Lb8
            mhx r0 = r0.a     // Catch: java.lang.Throwable -> Lb8
            dhyo r1 = new dhyo     // Catch: java.lang.Throwable -> Lb8
            r1.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r0 = defpackage.mkv.a(r0, r3, r13, r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> Lb8
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> Lb8
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L5d
            goto L6d
        L5d:
            dhyq r0 = new dhyq     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lb8
            r1[r13] = r4     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "Max storage size is exceeded for records of %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb8
            throw r0     // Catch: java.lang.Throwable -> Lb8
        L6d:
            if (r2 == 0) goto L91
            com.google.android.gms.threadnetwork.ThreadNetworkCredentials r0 = r2.b     // Catch: java.lang.Throwable -> Lb8
            r1 = r19
            boolean r0 = defpackage.dhrv.a(r1, r0, r3)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L93
            java.lang.String r0 = r2.k()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L93
            dhru r0 = r2.c()     // Catch: java.lang.Throwable -> Lb8
            r7 = r20
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L95
            monitor-exit(r16)
            return
        L91:
            r1 = r19
        L93:
            r7 = r20
        L95:
            byte[] r0 = r17.a()     // Catch: java.lang.Throwable -> Lb8
            int r3 = defpackage.dhyt.c     // Catch: java.lang.Throwable -> Lb8
            emgt r3 = defpackage.emgt.f     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r3 = r3.n(r0)     // Catch: java.lang.Throwable -> Lb8
            byte[] r5 = r1.b()     // Catch: java.lang.Throwable -> Lb8
            byte[] r0 = r1.a()     // Catch: java.lang.Throwable -> Lb8
            byte[] r6 = defpackage.dhyt.m(r0, r3)     // Catch: java.lang.Throwable -> Lb8
            r1 = r16
            r12 = r21
            r13 = r22
            r1.y(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r16)
            return
        Lb8:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> Lb8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.threadnetwork.credentials.storage.BorderAgentRoomDatabase.m(com.google.android.gms.threadnetwork.ThreadBorderAgent, java.lang.String, com.google.android.gms.threadnetwork.ThreadNetworkCredentials, dhru, java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.dhyr
    public final void n() {
        k();
    }

    @Override // defpackage.dhyr
    public final synchronized void o(dhyt dhytVar, Instant instant) {
        mhx mhxVar = v().a;
        final String h = dhytVar.h();
        final long epochMilli = instant.toEpochMilli();
        mkv.a(mhxVar, false, true, new fxwo() { // from class: dhyf
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                mjx a = ((mjo) obj).a("UPDATE border_agent_table SET uploaded_at=? WHERE id=?");
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

    @Override // defpackage.dhyr
    public final synchronized void p(dhyt dhytVar, dhru dhruVar) {
        dhyy dhyyVar = dhytVar.a;
        y(dhytVar, dhytVar.h(), dhytVar.k(), dhytVar.b.b(), dhyyVar.c, dhruVar, dhytVar.b(), dhytVar.a(), dhytVar.j(), dhytVar.i());
    }

    @Override // defpackage.dhyr
    public final synchronized void q(ThreadBorderAgent threadBorderAgent) {
        dhyt b = b(threadBorderAgent);
        if (b == null) {
            return;
        }
        x(b);
    }

    public abstract dhye v();

    public final synchronized void x(dhyt dhytVar) {
        elgo j = j(dhytVar.c());
        dhye v = v();
        final String h = dhytVar.h();
        mkv.a(v.a, false, true, new fxwo() { // from class: dhyi
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                mjx a = ((mjo) obj).a("DELETE FROM border_agent_table WHERE id=?");
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
        if (j.size() == 1 && ((dhyt) j.get(0)).h().equals(dhytVar.h())) {
            String concat = String.valueOf(dhytVar.h()).concat("/removed");
            try {
                v().c(new dhyy(concat, dhytVar.k(), dhyt.m(dhytVar.b.a(), concat), dhytVar.c(), dhytVar.l(), dhytVar.b(), dhytVar.a(), dhytVar.g().toEpochMilli(), dhytVar.j(), dhytVar.i()));
            } catch (dhzh e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
