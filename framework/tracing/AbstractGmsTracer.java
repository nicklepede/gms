package com.google.android.gms.framework.tracing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.asej;
import defpackage.asot;
import defpackage.bhdy;
import defpackage.bhea;
import defpackage.bhec;
import defpackage.bhed;
import defpackage.bhee;
import defpackage.bhef;
import defpackage.bhgt;
import defpackage.bhgv;
import defpackage.bhgw;
import defpackage.byhs;
import defpackage.egkp;
import defpackage.egmm;
import defpackage.egmn;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public abstract class AbstractGmsTracer {
    final ClassLoader b;
    final int c;
    final String d;
    final String e;
    final Class f;
    final String g;
    final int h;
    private static final asot i = asot.b("AbstractGmsTracer", asej.COMMON_BASE);
    private static final AtomicBoolean j = new AtomicBoolean(true);
    private static final AtomicBoolean k = new AtomicBoolean(true);
    private static final eijr l = eijy.a(new eijr() { // from class: bhgn
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(fneu.a.a().T());
        }
    });
    public static final ConcurrentMap a = new ConcurrentHashMap(10);

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractGmsTracer(java.lang.ClassLoader r6, int r7, android.content.Context r8, java.lang.String r9, java.lang.Class r10) {
        /*
            Method dump skipped, instructions count: 297
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
            ((ejhf) ((ejhf) i.i()).ah((char) 4983)).B("Traced class shouldn't be obfuscated: %s", simpleName);
        }
        return simpleName;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.egkp h(final java.lang.String r16, final defpackage.bhee r17, boolean r18, java.lang.Class r19, final java.lang.String r20, final int r21, defpackage.aqyc r22) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.framework.tracing.AbstractGmsTracer.h(java.lang.String, bhee, boolean, java.lang.Class, java.lang.String, int, aqyc):egkp");
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
            ((ejhf) ((ejhf) ((ejhf) i.i()).s(exc)).ah((char) 4985)).x("Reflection failed");
        }
    }

    private static void k() {
        j.getAndSet(false);
    }

    public final bhee a(String str, eijr eijrVar, Intent intent, ClassLoader classLoader) {
        bhed bhedVar;
        Bundle extras;
        fecj fecjVar;
        fecj v = bhee.a.v();
        fecj v2 = bhea.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        bhea bheaVar = (bhea) fecpVar;
        bheaVar.b |= 2;
        bheaVar.d = str;
        int i2 = this.h;
        if (!fecpVar.L()) {
            v2.U();
        }
        bhea bheaVar2 = (bhea) v2.b;
        bheaVar2.c = i2 - 1;
        bheaVar2.b |= 1;
        if (intent != null) {
            int a2 = byhs.a(intent.getAction());
            if (!v2.b.L()) {
                v2.U();
            }
            bhea bheaVar3 = (bhea) v2.b;
            bheaVar3.b |= 4;
            bheaVar3.e = a2;
        }
        if (!v.b.L()) {
            v.U();
        }
        bhee bheeVar = (bhee) v.b;
        bhea bheaVar4 = (bhea) v2.Q();
        bheaVar4.getClass();
        bheeVar.d = bheaVar4;
        bheeVar.b |= 2;
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            fecj v3 = bhef.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            fecp fecpVar2 = v3.b;
            bhef bhefVar = (bhef) fecpVar2;
            str2.getClass();
            bhefVar.b |= 1;
            bhefVar.c = str2;
            int i3 = this.c;
            if (i3 != -1) {
                if (!fecpVar2.L()) {
                    v3.U();
                }
                bhef bhefVar2 = (bhef) v3.b;
                bhefVar2.b |= 2;
                bhefVar2.d = i3;
            }
            if (!v.b.L()) {
                v.U();
            }
            bhee bheeVar2 = (bhee) v.b;
            bhef bhefVar3 = (bhef) v3.Q();
            bhefVar3.getClass();
            bheeVar2.e = bhefVar3;
            bheeVar2.b |= 4;
        }
        bhed bhedVar2 = bhed.a;
        if (eijrVar == null || egmm.j(egmn.a)) {
            bhedVar = bhedVar2;
        } else {
            bhedVar = (bhed) eijrVar.a();
            if (bhedVar == null) {
                bhedVar = bhed.a;
            }
        }
        int i4 = bhgt.a;
        if (intent != null && classLoader != null && (extras = intent.getExtras()) != null) {
            extras.setClassLoader(classLoader);
            String c = bhgt.c(extras, "gms_trace_module_LOGGED");
            if (c != null) {
                bhedVar = bhgt.a(c, bhedVar);
            }
            String c2 = bhgt.c(extras, "gms_trace_fired_alarms_ALARM_SOURCE");
            String c3 = bhgt.c(extras, "gms_trace_fired_alarms_ALARM_TYPE");
            if (c2 != null || c3 != null) {
                if (bhedVar == null) {
                    fecjVar = bhedVar2.v();
                } else {
                    fecjVar = (fecj) bhedVar.iB(5, null);
                    fecjVar.X(bhedVar);
                }
                String str3 = bhedVar == null ? "" : bhedVar.c;
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
                bhec bhecVar = bhec.ZERO_PARTY;
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                fecp fecpVar3 = fecjVar.b;
                bhed bhedVar3 = (bhed) fecpVar3;
                bhedVar3.g = bhecVar.h;
                bhedVar3.b |= 16;
                if (!fecpVar3.L()) {
                    fecjVar.U();
                }
                bhed bhedVar4 = (bhed) fecjVar.b;
                bhedVar4.b |= 1;
                bhedVar4.c = sb2;
                bhedVar = (bhed) fecjVar.Q();
            }
        }
        if (!v.b.L()) {
            v.U();
        }
        bhee bheeVar3 = (bhee) v.b;
        bhedVar.getClass();
        bheeVar3.c = bhedVar;
        bheeVar3.b |= 1;
        int i5 = bhgw.a;
        int a3 = bhgv.a.a();
        if (a3 != 7) {
            fecj v4 = bhdy.a.v();
            if (!v4.b.L()) {
                v4.U();
            }
            bhdy bhdyVar = (bhdy) v4.b;
            bhdyVar.b |= 1;
            bhdyVar.c = a3;
            if (!v.b.L()) {
                v.U();
            }
            bhee bheeVar4 = (bhee) v.b;
            bhdy bhdyVar2 = (bhdy) v4.Q();
            bhdyVar2.getClass();
            bheeVar4.f = bhdyVar2;
            bheeVar4.b |= 8;
        }
        return (bhee) v.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.egkp b(java.lang.String r11, defpackage.eijr r12, android.content.Intent r13, boolean r14, defpackage.aqyc r15) {
        /*
            r10 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.String r1 = "beginTraceInternalUsingReflection"
            java.lang.ClassLoader r2 = r10.b
            bhee r4 = r10.a(r11, r12, r13, r2)
            java.lang.Class<com.google.android.gms.framework.tracing.AbstractGmsTracer> r12 = com.google.android.gms.framework.tracing.AbstractGmsTracer.class
            java.lang.ClassLoader r13 = r12.getClassLoader()
            if (r2 != r13) goto L20
            java.lang.Class r6 = r10.f
            java.lang.String r7 = r10.g
            int r8 = r10.h
            r3 = r11
            r5 = r14
            r9 = r15
            egkp r11 = h(r3, r4, r5, r6, r7, r8, r9)
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
            bhgm r12 = new bhgm
            r12.<init>()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.framework.tracing.AbstractGmsTracer.b(java.lang.String, eijr, android.content.Intent, boolean, aqyc):egkp");
    }

    public final egkp c(String str, boolean z) {
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

    public final egkp g(String str, eijr eijrVar, Intent intent) {
        return b(str, eijrVar, intent, false, null);
    }

    public static Closeable beginTraceInternalUsingReflection(String str, byte[] bArr, boolean z, Class cls) {
        bhee bheeVar;
        if (bArr != null) {
            try {
                fecp y = fecp.y(bhee.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                bheeVar = (bhee) y;
            } catch (fedk e) {
                ((ejhf) ((ejhf) ((ejhf) i.i()).s(e)).ah((char) 4982)).x("Invalid GCoreClientInfo bytes.");
            }
            return h(str, bheeVar, z, cls, "", 1, null);
        }
        bheeVar = null;
        return h(str, bheeVar, z, cls, "", 1, null);
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
