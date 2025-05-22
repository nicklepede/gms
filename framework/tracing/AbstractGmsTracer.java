package com.google.android.gms.framework.tracing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bjio;
import defpackage.bjiq;
import defpackage.bjis;
import defpackage.bjit;
import defpackage.bjiu;
import defpackage.bjiv;
import defpackage.bjli;
import defpackage.bjlk;
import defpackage.bjll;
import defpackage.caqk;
import defpackage.eixs;
import defpackage.eizp;
import defpackage.eizq;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class AbstractGmsTracer {
    final ClassLoader b;
    final int c;
    final String d;
    final String e;
    final Class f;
    final String g;
    final int h;
    private static final ausn i = ausn.b("AbstractGmsTracer", auid.COMMON_BASE);
    private static final AtomicBoolean j = new AtomicBoolean(true);
    private static final AtomicBoolean k = new AtomicBoolean(true);
    public static final ConcurrentMap a = new ConcurrentHashMap(10);

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractGmsTracer(java.lang.ClassLoader r6, int r7, android.content.Context r8, java.lang.String r9, java.lang.Class r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.framework.tracing.AbstractGmsTracer.<init>(java.lang.ClassLoader, int, android.content.Context, java.lang.String, java.lang.Class):void");
    }

    private static Closeable beginTraceInternalUsingReflection(String str, byte[] bArr, boolean z) {
        return beginTraceInternalUsingReflection(str, bArr, z, null);
    }

    public static String e(Class cls) {
        String simpleName = cls.getSimpleName();
        if (simpleName.equals(cls.getName())) {
            ((eluo) ((eluo) i.i()).ai((char) 4993)).B("Traced class shouldn't be obfuscated: %s", simpleName);
        }
        return simpleName;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.eixs h(final java.lang.String r16, final defpackage.bjiu r17, boolean r18, java.lang.Class r19, final java.lang.String r20, final int r21, defpackage.atar r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.framework.tracing.AbstractGmsTracer.h(java.lang.String, bjiu, boolean, java.lang.Class, java.lang.String, int, atar):eixs");
    }

    private static String i(String str, String str2) {
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 2);
        sb.append(str2);
        sb.append('-');
        sb.append(str);
        sb.append('_');
        return sb.toString();
    }

    private static void j(Exception exc) {
        if (k.getAndSet(false)) {
            ((eluo) ((eluo) ((eluo) i.i()).s(exc)).ai((char) 4995)).x("Reflection failed");
        }
    }

    private static void k() {
        j.getAndSet(false);
    }

    public final bjiu a(String str, ekww ekwwVar, Intent intent, ClassLoader classLoader) {
        bjit bjitVar;
        Bundle extras;
        fgrc fgrcVar;
        fgrc v = bjiu.a.v();
        fgrc v2 = bjiq.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        bjiq bjiqVar = (bjiq) fgriVar;
        bjiqVar.b |= 2;
        bjiqVar.d = str;
        int i2 = this.h;
        if (!fgriVar.L()) {
            v2.U();
        }
        bjiq bjiqVar2 = (bjiq) v2.b;
        bjiqVar2.c = i2 - 1;
        bjiqVar2.b |= 1;
        if (intent != null) {
            int a2 = caqk.a(intent.getAction());
            if (!v2.b.L()) {
                v2.U();
            }
            bjiq bjiqVar3 = (bjiq) v2.b;
            bjiqVar3.b |= 4;
            bjiqVar3.e = a2;
        }
        if (!v.b.L()) {
            v.U();
        }
        bjiu bjiuVar = (bjiu) v.b;
        bjiq bjiqVar4 = (bjiq) v2.Q();
        bjiqVar4.getClass();
        bjiuVar.d = bjiqVar4;
        bjiuVar.b |= 2;
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            fgrc v3 = bjiv.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            fgri fgriVar2 = v3.b;
            bjiv bjivVar = (bjiv) fgriVar2;
            str2.getClass();
            bjivVar.b |= 1;
            bjivVar.c = str2;
            int i3 = this.c;
            if (i3 != -1) {
                if (!fgriVar2.L()) {
                    v3.U();
                }
                bjiv bjivVar2 = (bjiv) v3.b;
                bjivVar2.b |= 2;
                bjivVar2.d = i3;
            }
            if (!v.b.L()) {
                v.U();
            }
            bjiu bjiuVar2 = (bjiu) v.b;
            bjiv bjivVar3 = (bjiv) v3.Q();
            bjivVar3.getClass();
            bjiuVar2.e = bjivVar3;
            bjiuVar2.b |= 4;
        }
        bjit bjitVar2 = bjit.a;
        if (ekwwVar == null || eizp.j(eizq.a) || (bjitVar = (bjit) ekwwVar.lK()) == null) {
            bjitVar = bjitVar2;
        }
        int i4 = bjli.a;
        if (intent != null && classLoader != null && (extras = intent.getExtras()) != null) {
            extras.setClassLoader(classLoader);
            String c = bjli.c(extras, "gms_trace_module_LOGGED");
            if (c != null) {
                bjitVar = bjli.a(c, bjitVar);
            }
            String c2 = bjli.c(extras, "gms_trace_fired_alarms_ALARM_SOURCE");
            String c3 = bjli.c(extras, "gms_trace_fired_alarms_ALARM_TYPE");
            if (c2 != null || c3 != null) {
                if (bjitVar == null) {
                    fgrcVar = bjitVar2.v();
                } else {
                    fgrcVar = (fgrc) bjitVar.iQ(5, null);
                    fgrcVar.X(bjitVar);
                }
                String str3 = bjitVar == null ? "" : bjitVar.c;
                StringBuilder sb = new StringBuilder();
                if (str3.length() > 0) {
                    sb.append(str3);
                    sb.append('-');
                }
                if (c2 == null) {
                    c2 = "unknown";
                }
                if (c3 == null) {
                    c3 = "unknown";
                }
                sb.append("alarm_source:");
                sb.append(c2);
                sb.append("-alarm_type:");
                sb.append(c3);
                String sb2 = sb.toString();
                bjis bjisVar = bjis.ZERO_PARTY;
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                fgri fgriVar3 = fgrcVar.b;
                bjit bjitVar3 = (bjit) fgriVar3;
                bjitVar3.g = bjisVar.h;
                bjitVar3.b |= 16;
                if (!fgriVar3.L()) {
                    fgrcVar.U();
                }
                bjit bjitVar4 = (bjit) fgrcVar.b;
                bjitVar4.b |= 1;
                bjitVar4.c = sb2;
                bjitVar = (bjit) fgrcVar.Q();
            }
        }
        if (!v.b.L()) {
            v.U();
        }
        bjiu bjiuVar3 = (bjiu) v.b;
        bjitVar.getClass();
        bjiuVar3.c = bjitVar;
        bjiuVar3.b |= 1;
        int i5 = bjll.a;
        int a3 = bjlk.a.a();
        if (a3 != 7) {
            fgrc v4 = bjio.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            bjio bjioVar = (bjio) v4.b;
            bjioVar.b |= 1;
            bjioVar.c = a3;
            if (!v.b.L()) {
                v.U();
            }
            bjiu bjiuVar4 = (bjiu) v.b;
            bjio bjioVar2 = (bjio) v4.Q();
            bjioVar2.getClass();
            bjiuVar4.f = bjioVar2;
            bjiuVar4.b |= 8;
        }
        return (bjiu) v.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eixs b(java.lang.String r11, defpackage.ekww r12, android.content.Intent r13, boolean r14, defpackage.atar r15) {
        /*
            r10 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.String r1 = "beginTraceInternalUsingReflection"
            java.lang.ClassLoader r2 = r10.b
            bjiu r4 = r10.a(r11, r12, r13, r2)
            java.lang.Class<com.google.android.gms.framework.tracing.AbstractGmsTracer> r12 = com.google.android.gms.framework.tracing.AbstractGmsTracer.class
            java.lang.ClassLoader r13 = r12.getClassLoader()
            if (r2 != r13) goto L20
            java.lang.Class r6 = r10.f
            java.lang.String r7 = r10.g
            int r8 = r10.h
            r3 = r11
            r5 = r14
            r9 = r15
            eixs r11 = h(r3, r4, r5, r6, r7, r8, r9)
            return r11
        L20:
            r3 = r11
            r5 = r14
            java.util.concurrent.ConcurrentMap r11 = com.google.android.gms.framework.tracing.AbstractGmsTracer.a
            java.lang.Object r11 = r11.get(r2)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r13 = 4
            r14 = 2
            r15 = 0
            r6 = 3
            r7 = 1
            if (r11 != 0) goto L75
            java.lang.String r12 = r12.getCanonicalName()     // Catch: java.lang.ClassNotFoundException -> L72
            java.lang.Class r12 = java.lang.Class.forName(r12, r7, r2)     // Catch: java.lang.ClassNotFoundException -> L72
            java.lang.Class[] r8 = new java.lang.Class[r13]     // Catch: java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L72
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r15] = r9     // Catch: java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L72
            r8[r7] = r0     // Catch: java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L72
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L72
            r8[r14] = r9     // Catch: java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L72
            java.lang.Class<java.lang.Class> r9 = java.lang.Class.class
            r8[r6] = r9     // Catch: java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L72
            java.lang.reflect.Method r11 = r12.getDeclaredMethod(r1, r8)     // Catch: java.lang.NoSuchMethodException -> L4e java.lang.ClassNotFoundException -> L72
            goto L51
        L4e:
            k()     // Catch: java.lang.ClassNotFoundException -> L72
        L51:
            if (r11 != 0) goto L67
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L64 java.lang.ClassNotFoundException -> L72
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r15] = r9     // Catch: java.lang.NoSuchMethodException -> L64 java.lang.ClassNotFoundException -> L72
            r8[r7] = r0     // Catch: java.lang.NoSuchMethodException -> L64 java.lang.ClassNotFoundException -> L72
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L64 java.lang.ClassNotFoundException -> L72
            r8[r14] = r0     // Catch: java.lang.NoSuchMethodException -> L64 java.lang.ClassNotFoundException -> L72
            java.lang.reflect.Method r11 = r12.getDeclaredMethod(r1, r8)     // Catch: java.lang.NoSuchMethodException -> L64 java.lang.ClassNotFoundException -> L72
            goto L67
        L64:
            k()     // Catch: java.lang.ClassNotFoundException -> L72
        L67:
            if (r11 == 0) goto L75
            r11.setAccessible(r7)     // Catch: java.lang.ClassNotFoundException -> L72
            java.util.concurrent.ConcurrentMap r12 = com.google.android.gms.framework.tracing.AbstractGmsTracer.a     // Catch: java.lang.ClassNotFoundException -> L72
            r12.put(r2, r11)     // Catch: java.lang.ClassNotFoundException -> L72
            goto L75
        L72:
            k()
        L75:
            r12 = 0
            if (r11 == 0) goto Lc4
            java.lang.Class[] r0 = r11.getParameterTypes()     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            int r0 = r0.length     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            if (r0 != r13) goto L9e
            if (r4 != 0) goto L83
            r0 = r12
            goto L87
        L83:
            byte[] r0 = r4.r()     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
        L87:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            java.lang.Class r2 = r10.f     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            r13[r15] = r3     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            r13[r7] = r0     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            r13[r14] = r1     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            r13[r6] = r2     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            java.lang.Object r11 = r11.invoke(r12, r13)     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            java.io.Closeable r11 = (java.io.Closeable) r11     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            goto Lc5
        L9e:
            if (r4 != 0) goto La2
            r13 = r12
            goto La6
        La2:
            byte[] r13 = r4.r()     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
        La6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            r1[r15] = r3     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            r1[r7] = r13     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            r1[r14] = r0     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            java.lang.Object r11 = r11.invoke(r12, r1)     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            java.io.Closeable r11 = (java.io.Closeable) r11     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.IllegalAccessException -> Lbf
            goto Lc5
        Lb9:
            r0 = move-exception
            r11 = r0
            j(r11)
            goto Lc4
        Lbf:
            r0 = move-exception
            r11 = r0
            j(r11)
        Lc4:
            r11 = r12
        Lc5:
            if (r11 != 0) goto Lc8
            return r12
        Lc8:
            bjlc r12 = new bjlc
            r12.<init>()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.framework.tracing.AbstractGmsTracer.b(java.lang.String, ekww, android.content.Intent, boolean, atar):eixs");
    }

    public final eixs c(String str, boolean z) {
        return b(d(str), null, null, z, null);
    }

    public final String d(String str) {
        StringBuilder f = f(str.length());
        f.append(str);
        return f.toString();
    }

    public final StringBuilder f(int i2) {
        String str = this.e;
        StringBuilder sb = new StringBuilder(str.length() + i2);
        sb.append(str);
        return sb;
    }

    public final eixs g(String str, ekww ekwwVar, Intent intent) {
        return b(str, ekwwVar, intent, false, null);
    }

    public static Closeable beginTraceInternalUsingReflection(String str, byte[] bArr, boolean z, Class cls) {
        bjiu bjiuVar;
        if (bArr != null) {
            try {
                fgri y = fgri.y(bjiu.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                bjiuVar = (bjiu) y;
            } catch (fgsd e) {
                ((eluo) ((eluo) ((eluo) i.i()).s(e)).ai((char) 4992)).x("Invalid GCoreClientInfo bytes.");
            }
            return h(str, bjiuVar, z, cls, "", 1, null);
        }
        bjiuVar = null;
        return h(str, bjiuVar, z, cls, "", 1, null);
    }

    public AbstractGmsTracer(ClassLoader classLoader, int i2, String str, String str2, Class cls) {
        this.b = classLoader;
        this.h = i2;
        this.d = str;
        this.c = -1;
        this.e = i(str2, str);
        this.f = cls;
        this.g = "";
    }
}
