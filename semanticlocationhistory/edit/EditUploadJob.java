package com.google.android.gms.semanticlocationhistory.edit;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.czje;
import defpackage.czlk;
import defpackage.dade;
import defpackage.dadh;
import defpackage.daga;
import defpackage.dahq;
import defpackage.dajf;
import defpackage.daky;
import defpackage.daqi;
import defpackage.daqp;
import defpackage.daqr;
import defpackage.daqt;
import defpackage.dbhz;
import defpackage.eipl;
import defpackage.eits;
import defpackage.ejcg;
import defpackage.frxn;
import defpackage.frxq;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class EditUploadJob extends GmsTaskBoundService {
    private dbhz c;
    private dade d;
    private daga e;
    private czlk f;
    private dahq g;
    private czje h;
    private dajf j;
    private final daqt k = new daqt();
    private final daqp l = new daqp();
    private final daqi m = new daqi();
    private final daqr n = new daqr();
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "EditUploadJob");
    public static final String a = EditUploadJob.class.getName();

    private final czje d() {
        if (this.h == null) {
            this.h = new czje();
        }
        return this.h;
    }

    private final czlk e() {
        if (this.f == null) {
            this.f = new czlk(d());
        }
        return this.f;
    }

    private final dade f(Context context) {
        if (this.d == null) {
            this.d = dadh.w(context);
        }
        return this.d;
    }

    private final daga g() {
        if (this.e == null) {
            this.e = new daga();
        }
        return this.e;
    }

    private final dahq h() {
        if (this.g == null) {
            this.g = new dahq();
        }
        return this.g;
    }

    private final dajf j(Context context) {
        if (this.j == null) {
            this.j = dajf.a(e(), k(), f(context), g(), new daky(), d());
        }
        return this.j;
    }

    private final dbhz k() {
        if (this.c == null) {
            this.c = new dbhz();
        }
        return this.c;
    }

    private final eits l() {
        if (!frxn.I()) {
            return ejcg.a;
        }
        Map unmodifiableMap = frxq.h() ? DesugarCollections.unmodifiableMap(e().g().g) : e().A();
        return (eits) Collection.EL.stream((unmodifiableMap == null ? ejcg.a : eits.k(unmodifiableMap)).entrySet()).collect(eipl.a(new Function() { // from class: darc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Long) ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: dard
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                czts cztsVar = (czts) ((Map.Entry) obj).getValue();
                fedb fedbVar = cztsVar.e;
                List<Long> subList = fedbVar.subList(0, Math.min(3, fedbVar.size()));
                eito eitoVar = new eito();
                for (Long l : subList) {
                    l.longValue();
                    cztq cztqVar = cztq.a;
                    feea feeaVar = cztsVar.c;
                    if (feeaVar.containsKey(l)) {
                        cztqVar = (cztq) feeaVar.get(l);
                    }
                    eitoVar.i(l, cztqVar);
                }
                fecj fecjVar = (fecj) cztsVar.iB(5, null);
                fecjVar.X(cztsVar);
                cztn cztnVar = (cztn) fecjVar;
                if (!cztnVar.b.L()) {
                    cztnVar.U();
                }
                ((czts) cztnVar.b).e = fedu.a;
                cztnVar.a(subList);
                if (!cztnVar.b.L()) {
                    cztnVar.U();
                }
                ((czts) cztnVar.b).b().clear();
                cztnVar.k(eitoVar.b());
                return (czts) cztnVar.Q();
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
    /* JADX WARN: Type inference failed for: r0v14, types: [eitj, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m(final android.accounts.Account r33, defpackage.eitj r34, defpackage.fefi r35, android.content.Context r36) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.edit.EditUploadJob.m(android.accounts.Account, eitj, fefi, android.content.Context):boolean");
    }

    private static final boolean n(Account account) {
        return account.name.equals("test1.currentsemanticlocation@gmail.com");
    }

    /* JADX WARN: Code restructure failed: missing block: B:400:0x0167, code lost:
    
        if (((java.lang.Boolean) ((defpackage.enpf) defpackage.enps.f(defpackage.ensi.h(r1.e().i()), new defpackage.czki(r7), defpackage.enre.a)).u()).booleanValue() == false) goto L38;
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
    /* JADX WARN: Removed duplicated region for block: B:155:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06b6 A[Catch: ftyg -> 0x070e, ftye -> 0x0710, unx -> 0x0712, all -> 0x0b22, TryCatch #1 {all -> 0x0b22, blocks: (B:212:0x06ab, B:214:0x06b6, B:215:0x06d7, B:383:0x0720), top: B:211:0x06ab }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x073b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01af  */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.enss im(defpackage.byln r46) {
        /*
            Method dump skipped, instructions count: 3054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.edit.EditUploadJob.im(byln):enss");
    }
}
