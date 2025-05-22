package com.google.android.gms.semanticlocationhistory.edit;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcqi;
import defpackage.dcry;
import defpackage.dctn;
import defpackage.dcvg;
import defpackage.ddaq;
import defpackage.ddax;
import defpackage.ddaz;
import defpackage.ddbb;
import defpackage.ddsf;
import defpackage.elcq;
import defpackage.elgx;
import defpackage.elpl;
import defpackage.fush;
import defpackage.fusk;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class EditUploadJob extends GmsTaskBoundService {
    private ddsf c;
    private dcnm d;
    private dcqi e;
    private dbvg f;
    private dcry g;
    private dbtc h;
    private dctn j;
    private final ddbb k = new ddbb();
    private final ddax l = new ddax();
    private final ddaq m = new ddaq();
    private final ddaz n = new ddaz();
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "EditUploadJob");
    public static final String a = EditUploadJob.class.getName();

    private final dbtc d() {
        if (this.h == null) {
            this.h = new dbtc();
        }
        return this.h;
    }

    private final dbvg e() {
        if (this.f == null) {
            this.f = new dbvg(d());
        }
        return this.f;
    }

    private final dcnm f(Context context) {
        if (this.d == null) {
            this.d = dcnp.w(context);
        }
        return this.d;
    }

    private final dcqi g() {
        if (this.e == null) {
            this.e = new dcqi();
        }
        return this.e;
    }

    private final dcry h() {
        if (this.g == null) {
            this.g = new dcry();
        }
        return this.g;
    }

    private final dctn j(Context context) {
        if (this.j == null) {
            this.j = dctn.a(e(), k(), f(context), g(), new dcvg(), d());
        }
        return this.j;
    }

    private final ddsf k() {
        if (this.c == null) {
            this.c = new ddsf();
        }
        return this.c;
    }

    private final elgx l() {
        if (!fush.I()) {
            return elpl.a;
        }
        Map unmodifiableMap = fusk.g() ? DesugarCollections.unmodifiableMap(e().g().g) : e().A();
        return (elgx) Collection.EL.stream((unmodifiableMap == null ? elpl.a : elgx.k(unmodifiableMap)).entrySet()).collect(elcq.a(new Function() { // from class: ddbk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Long) ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: ddbl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dcdt dcdtVar = (dcdt) ((Map.Entry) obj).getValue();
                fgru fgruVar = dcdtVar.e;
                List<Long> subList = fgruVar.subList(0, Math.min(3, fgruVar.size()));
                elgt elgtVar = new elgt();
                for (Long l : subList) {
                    l.longValue();
                    dcdr dcdrVar = dcdr.a;
                    fgst fgstVar = dcdtVar.c;
                    if (fgstVar.containsKey(l)) {
                        dcdrVar = (dcdr) fgstVar.get(l);
                    }
                    elgtVar.i(l, dcdrVar);
                }
                fgrc fgrcVar = (fgrc) dcdtVar.iQ(5, null);
                fgrcVar.X(dcdtVar);
                dcdo dcdoVar = (dcdo) fgrcVar;
                if (!dcdoVar.b.L()) {
                    dcdoVar.U();
                }
                ((dcdt) dcdoVar.b).e = fgsn.a;
                dcdoVar.a(subList);
                if (!dcdoVar.b.L()) {
                    dcdoVar.U();
                }
                ((dcdt) dcdoVar.b).b().clear();
                dcdoVar.k(elgtVar.b());
                return (dcdt) dcdoVar.Q();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Type inference failed for: r0v14, types: [elgo, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m(final android.accounts.Account r33, defpackage.elgo r34, defpackage.fgub r35, android.content.Context r36) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.edit.EditUploadJob.m(android.accounts.Account, elgo, fgub, android.content.Context):boolean");
    }

    private static final boolean n(Account account) {
        return account.name.equals("test1.currentsemanticlocation@gmail.com");
    }

    /* JADX WARN: Code restructure failed: missing block: B:400:0x0167, code lost:
    
        if (((java.lang.Boolean) ((defpackage.eqcy) defpackage.eqdl.f(defpackage.eqgb.h(r1.e().i()), new defpackage.dbug(r7), defpackage.eqex.a)).u()).booleanValue() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0125, code lost:
    
        if (r1.e().d(r7).r == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        r36 = r2;
        r26 = r5;
        r27 = r6;
        r28 = r8;
        r29 = r10;
        r30 = r11;
        r31 = r13;
        r32 = r14;
        r2 = r1;
        r1 = r3;
        r3 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06be A[Catch: fwue -> 0x0714, fwuc -> 0x0716, wjw -> 0x0718, all -> 0x0b28, TryCatch #3 {all -> 0x0b28, blocks: (B:212:0x06b3, B:214:0x06be, B:215:0x06dd, B:383:0x0726), top: B:211:0x06b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0741 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01af  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r46) {
        /*
            Method dump skipped, instructions count: 3060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.edit.EditUploadJob.iB(cauf):eqgl");
    }
}
