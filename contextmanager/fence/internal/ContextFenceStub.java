package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.atoz;
import defpackage.atpa;
import defpackage.atpc;
import defpackage.atph;
import defpackage.atpl;
import defpackage.atpr;
import defpackage.atps;
import defpackage.atpt;
import defpackage.atpu;
import defpackage.atpv;
import defpackage.atpw;
import defpackage.atpx;
import defpackage.atpy;
import defpackage.atqa;
import defpackage.atqb;
import defpackage.atqc;
import defpackage.atqd;
import defpackage.atqe;
import defpackage.atqg;
import defpackage.atqh;
import defpackage.fdcp;
import defpackage.fdcs;
import defpackage.fdcw;
import defpackage.fdde;
import defpackage.fddg;
import defpackage.fddh;
import defpackage.fddn;
import defpackage.fdei;
import defpackage.fden;
import defpackage.fdeq;
import defpackage.fdet;
import defpackage.fdew;
import defpackage.fdfa;
import defpackage.fdfb;
import defpackage.fdfe;
import defpackage.fdfh;
import defpackage.fdfi;
import defpackage.fdfl;
import defpackage.fdfr;
import defpackage.fdfu;
import defpackage.fdfx;
import defpackage.fdga;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feeq;
import defpackage.fwac;
import defpackage.qkv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ContextFenceStub extends AwarenessFence implements atpl {
    public static final Parcelable.Creator CREATOR = new atph();
    private fddh a;
    private byte[] b;
    private ArrayList c;
    private atqd d;
    private atqd e;
    private atps f;
    private atpw g;
    private atoz h;
    private atqa i;
    private atpx j;
    private atpv k;
    private atpa l;
    private atpc m;
    private atpt n;
    private atqe o;
    private atpu p;
    private atpy q;
    private atpr r;
    private atqc s;
    private atqg t;
    private atqb u;
    private atqh v;

    public ContextFenceStub(fddh fddhVar) {
        arwm.s(fddhVar);
        this.a = fddhVar;
        this.b = null;
        n();
    }

    public static ContextFenceStub c(atqd atqdVar) {
        fdde fddeVar;
        fdfr fdfrVar = atqdVar.b;
        if (fdfrVar.g) {
            fddeVar = (fdde) fddh.b.v();
            fddg fddgVar = fddg.LOCAL_TIME_FENCE;
            if (!fddeVar.b.L()) {
                fddeVar.U();
            }
            fddh fddhVar = (fddh) fddeVar.b;
            fddhVar.d = fddgVar.z;
            fddhVar.c |= 1;
            if (!fddeVar.b.L()) {
                fddeVar.U();
            }
            fddh fddhVar2 = (fddh) fddeVar.b;
            fddhVar2.u = fdfrVar;
            fddhVar2.c |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        } else {
            fddeVar = (fdde) fddh.b.v();
            fddg fddgVar2 = fddg.TIME_FENCE;
            if (!fddeVar.b.L()) {
                fddeVar.U();
            }
            fddh fddhVar3 = (fddh) fddeVar.b;
            fddhVar3.d = fddgVar2.z;
            fddhVar3.c |= 1;
            if (!fddeVar.b.L()) {
                fddeVar.U();
            }
            fddh fddhVar4 = (fddh) fddeVar.b;
            fddhVar4.f = fdfrVar;
            fddhVar4.c |= 2;
        }
        return new ContextFenceStub((fddh) fddeVar.Q());
    }

    public static List h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContextFenceStub) it.next()).f());
        }
        return arrayList;
    }

    private final void m() {
        if (this.a == null) {
            try {
                byte[] bArr = this.b;
                arwm.s(bArr);
                fecp y = fecp.y(fddh.b, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                this.a = (fddh) y;
                this.b = null;
            } catch (fedk e) {
                qkv.b("ContextFenceStub", "Could not deserialize context fence bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        n();
    }

    private final void n() {
        fddh fddhVar = this.a;
        if (fddhVar != null || this.b == null) {
            if (fddhVar == null || this.b != null) {
                if (fddhVar != null && this.b != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (fddhVar != null || this.b != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // defpackage.atpl
    public final int a() {
        atpl d = d();
        if (d == null) {
            return -2;
        }
        return d.a();
    }

    public final int b() {
        m();
        fddh fddhVar = this.a;
        arwm.s(fddhVar);
        if ((fddhVar.c & 1) == 0) {
            return 0;
        }
        fddh fddhVar2 = this.a;
        arwm.s(fddhVar2);
        fddg b = fddg.b(fddhVar2.d);
        if (b == null) {
            b = fddg.UNKNOWN_CONTEXT_FENCE_TYPE;
        }
        return b.z;
    }

    public final atpl d() {
        switch (b()) {
            case 4:
                m();
                fddh fddhVar = this.a;
                arwm.s(fddhVar);
                if ((fddhVar.c & 2) != 0) {
                    if (this.d == null) {
                        fddh fddhVar2 = this.a;
                        arwm.s(fddhVar2);
                        fdfr fdfrVar = fddhVar2.f;
                        if (fdfrVar == null) {
                            fdfrVar = fdfr.a;
                        }
                        this.d = new atqd(fdfrVar);
                    }
                    return this.d;
                }
            case 1:
            case 2:
            case 3:
            case fwac.v /* 22 */:
                return null;
            case 5:
                m();
                fddh fddhVar3 = this.a;
                arwm.s(fddhVar3);
                if ((fddhVar3.c & 4) == 0) {
                    return null;
                }
                if (this.f == null) {
                    fddh fddhVar4 = this.a;
                    arwm.s(fddhVar4);
                    fdei fdeiVar = fddhVar4.g;
                    if (fdeiVar == null) {
                        fdeiVar = fdei.a;
                    }
                    this.f = new atps(fdeiVar);
                }
                return this.f;
            case 6:
                return e();
            case 7:
                m();
                fddh fddhVar5 = this.a;
                arwm.s(fddhVar5);
                if ((fddhVar5.c & 16) == 0) {
                    return null;
                }
                if (this.h == null) {
                    fddh fddhVar6 = this.a;
                    arwm.s(fddhVar6);
                    fdcp fdcpVar = fddhVar6.i;
                    if (fdcpVar == null) {
                        fdcpVar = fdcp.b;
                    }
                    this.h = new atoz(fdcpVar);
                }
                return this.h;
            case 8:
                m();
                fddh fddhVar7 = this.a;
                arwm.s(fddhVar7);
                if ((fddhVar7.c & 32) == 0) {
                    return null;
                }
                if (this.i == null) {
                    fddh fddhVar8 = this.a;
                    arwm.s(fddhVar8);
                    fdfh fdfhVar = fddhVar8.j;
                    if (fdfhVar == null) {
                        fdfhVar = fdfh.a;
                    }
                    this.i = new atqa(fdfhVar);
                }
                return this.i;
            case 9:
                m();
                fddh fddhVar9 = this.a;
                arwm.s(fddhVar9);
                if ((fddhVar9.c & 64) == 0) {
                    return null;
                }
                if (this.j == null) {
                    fddh fddhVar10 = this.a;
                    arwm.s(fddhVar10);
                    fdfa fdfaVar = fddhVar10.k;
                    if (fdfaVar == null) {
                        fdfaVar = fdfa.b;
                    }
                    this.j = new atpx(fdfaVar);
                }
                return this.j;
            case 10:
                m();
                fddh fddhVar11 = this.a;
                arwm.s(fddhVar11);
                if ((fddhVar11.c & 128) == 0) {
                    return null;
                }
                if (this.k == null) {
                    fddh fddhVar12 = this.a;
                    arwm.s(fddhVar12);
                    fdet fdetVar = fddhVar12.l;
                    if (fdetVar == null) {
                        fdetVar = fdet.a;
                    }
                    this.k = new atpv(fdetVar);
                }
                return this.k;
            case 11:
                m();
                fddh fddhVar13 = this.a;
                arwm.s(fddhVar13);
                if ((fddhVar13.c & 256) == 0) {
                    return null;
                }
                if (this.l == null) {
                    fddh fddhVar14 = this.a;
                    arwm.s(fddhVar14);
                    fdcs fdcsVar = fddhVar14.m;
                    if (fdcsVar == null) {
                        fdcsVar = fdcs.a;
                    }
                    this.l = new atpa(fdcsVar);
                }
                return this.l;
            case 12:
                m();
                fddh fddhVar15 = this.a;
                arwm.s(fddhVar15);
                if ((fddhVar15.c & 512) == 0) {
                    return null;
                }
                if (this.m == null) {
                    fddh fddhVar16 = this.a;
                    arwm.s(fddhVar16);
                    fdcw fdcwVar = fddhVar16.n;
                    if (fdcwVar == null) {
                        fdcwVar = fdcw.a;
                    }
                    this.m = new atpc(fdcwVar);
                }
                return this.m;
            case 13:
                m();
                fddh fddhVar17 = this.a;
                arwm.s(fddhVar17);
                if ((fddhVar17.c & 1024) == 0) {
                    return null;
                }
                if (this.n == null) {
                    fddh fddhVar18 = this.a;
                    arwm.s(fddhVar18);
                    fden fdenVar = fddhVar18.o;
                    if (fdenVar == null) {
                        fdenVar = fden.c;
                    }
                    this.n = new atpt(fdenVar);
                }
                return this.n;
            case 14:
            default:
                qkv.d("ContextFenceStub", "Unknown fence stub type=%s", Integer.valueOf(b()));
                return null;
            case 15:
                m();
                fddh fddhVar19 = this.a;
                arwm.s(fddhVar19);
                if ((fddhVar19.c & 8192) == 0) {
                    return null;
                }
                if (this.o == null) {
                    fddh fddhVar20 = this.a;
                    arwm.s(fddhVar20);
                    fdfu fdfuVar = fddhVar20.p;
                    if (fdfuVar == null) {
                        fdfuVar = fdfu.a;
                    }
                    this.o = new atqe(fdfuVar);
                }
                return this.o;
            case 16:
                m();
                fddh fddhVar21 = this.a;
                arwm.s(fddhVar21);
                if ((fddhVar21.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) {
                    return null;
                }
                if (this.r == null) {
                    fddh fddhVar22 = this.a;
                    arwm.s(fddhVar22);
                    fddn fddnVar = fddhVar22.q;
                    if (fddnVar == null) {
                        fddnVar = fddn.a;
                    }
                    this.r = new atpr(fddnVar);
                }
                return this.r;
            case fwac.q /* 17 */:
                m();
                fddh fddhVar23 = this.a;
                arwm.s(fddhVar23);
                if ((fddhVar23.c & 32768) == 0) {
                    return null;
                }
                if (this.p == null) {
                    fddh fddhVar24 = this.a;
                    arwm.s(fddhVar24);
                    fdeq fdeqVar = fddhVar24.r;
                    if (fdeqVar == null) {
                        fdeqVar = fdeq.a;
                    }
                    this.p = new atpu(fdeqVar);
                }
                return this.p;
            case 18:
                m();
                fddh fddhVar25 = this.a;
                arwm.s(fddhVar25);
                if ((fddhVar25.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 0) {
                    return null;
                }
                if (this.q == null) {
                    fddh fddhVar26 = this.a;
                    arwm.s(fddhVar26);
                    fdfe fdfeVar = fddhVar26.s;
                    if (fdfeVar == null) {
                        fdfeVar = fdfe.a;
                    }
                    this.q = new atpy(fdfeVar);
                }
                return this.q;
            case 19:
                m();
                fddh fddhVar27 = this.a;
                arwm.s(fddhVar27);
                if ((fddhVar27.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) == 0) {
                    return null;
                }
                if (this.s == null) {
                    fddh fddhVar28 = this.a;
                    arwm.s(fddhVar28);
                    fdfl fdflVar = fddhVar28.t;
                    if (fdflVar == null) {
                        fdflVar = fdfl.a;
                    }
                    this.s = new atqc(fdflVar);
                }
                return this.s;
            case fwac.t /* 20 */:
                m();
                fddh fddhVar29 = this.a;
                arwm.s(fddhVar29);
                if ((fddhVar29.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) == 0) {
                    return null;
                }
                if (this.e == null) {
                    fddh fddhVar30 = this.a;
                    arwm.s(fddhVar30);
                    fdfr fdfrVar2 = fddhVar30.u;
                    if (fdfrVar2 == null) {
                        fdfrVar2 = fdfr.a;
                    }
                    this.e = new atqd(fdfrVar2);
                }
                return this.e;
            case fwac.u /* 21 */:
                m();
                fddh fddhVar31 = this.a;
                arwm.s(fddhVar31);
                if ((fddhVar31.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) == 0) {
                    return null;
                }
                if (this.t == null) {
                    fddh fddhVar32 = this.a;
                    arwm.s(fddhVar32);
                    fdfx fdfxVar = fddhVar32.v;
                    if (fdfxVar == null) {
                        fdfxVar = fdfx.a;
                    }
                    this.t = new atqg(fdfxVar);
                }
                return this.t;
            case fwac.w /* 23 */:
                m();
                fddh fddhVar33 = this.a;
                arwm.s(fddhVar33);
                if ((fddhVar33.c & 2097152) == 0) {
                    return null;
                }
                if (this.u == null) {
                    fddh fddhVar34 = this.a;
                    arwm.s(fddhVar34);
                    fdfi fdfiVar = fddhVar34.y;
                    if (fdfiVar == null) {
                        fdfiVar = fdfi.a;
                    }
                    this.u = new atqb(fdfiVar);
                }
                return this.u;
            case fwac.x /* 24 */:
                m();
                fddh fddhVar35 = this.a;
                arwm.s(fddhVar35);
                if ((fddhVar35.c & 4194304) == 0) {
                    return null;
                }
                if (this.v == null) {
                    fddh fddhVar36 = this.a;
                    arwm.s(fddhVar36);
                    fdga fdgaVar = fddhVar36.z;
                    if (fdgaVar == null) {
                        fdgaVar = fdga.a;
                    }
                    this.v = new atqh(fdgaVar);
                }
                return this.v;
        }
    }

    public final atpw e() {
        m();
        fddh fddhVar = this.a;
        arwm.s(fddhVar);
        if ((fddhVar.c & 8) == 0) {
            return null;
        }
        if (this.g == null) {
            fddh fddhVar2 = this.a;
            arwm.s(fddhVar2);
            fdew fdewVar = fddhVar2.h;
            if (fdewVar == null) {
                fdewVar = fdew.a;
            }
            this.g = new atpw(fdewVar);
        }
        return this.g;
    }

    public final fddh f() {
        m();
        fddh fddhVar = this.a;
        arwm.s(fddhVar);
        return fddhVar;
    }

    public final ArrayList g() {
        m();
        if (this.c == null) {
            fddh fddhVar = this.a;
            arwm.s(fddhVar);
            this.c = new ArrayList(fddhVar.e.size());
            fddh fddhVar2 = this.a;
            arwm.s(fddhVar2);
            for (fddh fddhVar3 : fddhVar2.e) {
                ArrayList arrayList = this.c;
                arwm.s(arrayList);
                arrayList.add(new ContextFenceStub(fddhVar3));
            }
        }
        ArrayList arrayList2 = this.c;
        arwm.s(arrayList2);
        return arrayList2;
    }

    public final void i(Set set) {
        set.add(Integer.valueOf(b()));
        int b = b();
        if (b == 1 || b == 2 || b == 3 || b == 22) {
            set.add(Integer.valueOf(b()));
            ArrayList g = g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                ((ContextFenceStub) g.get(i)).i(set);
            }
        }
    }

    public final void j(Set set) {
        int b = b();
        if (b != 1 && b != 2 && b != 3) {
            if (b != 22) {
                atpl d = d();
                if (d == null) {
                    qkv.d("ContextFenceStub", "Expected a primitive fence for type=%s", Integer.valueOf(b()));
                } else {
                    set.add(Integer.valueOf(d.a()));
                }
                fddh fddhVar = this.a;
                arwm.s(fddhVar);
                if ((fddhVar.c & 1048576) != 0) {
                    if (d instanceof atps) {
                        set.addAll(Collections.singletonList(46));
                        return;
                    } else {
                        arwm.s(d);
                        qkv.d("ContextFenceStub", "Predictive fences are not supported for context: %s", Integer.valueOf(d.a()));
                        set.add(-3);
                        return;
                    }
                }
                return;
            }
            fddh fddhVar2 = this.a;
            arwm.s(fddhVar2);
            if ((fddhVar2.c & 1048576) == 0) {
                qkv.c("ContextFenceStub", "Predictive fence without predictive parameters.");
                set.add(-3);
                return;
            }
        }
        ArrayList g = g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            ((ContextFenceStub) g.get(i)).j(set);
        }
    }

    public final boolean k() {
        int b = b();
        if (b != 1 && b != 2 && b != 3 && b != 22) {
            return false;
        }
        ArrayList g = g();
        int size = g.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ContextFenceStub contextFenceStub = (ContextFenceStub) g.get(i);
            fddh fddhVar = this.a;
            arwm.s(fddhVar);
            if ((fddhVar.c & 1048576) != 0) {
                fddh fddhVar2 = this.a;
                arwm.s(fddhVar2);
                fdfb fdfbVar = fddhVar2.x;
                if (fdfbVar == null) {
                    fdfbVar = fdfb.a;
                }
                if (fdfbVar == null) {
                    fddh fddhVar3 = contextFenceStub.a;
                    arwm.s(fddhVar3);
                    fecj fecjVar = (fecj) fddhVar3.iB(5, null);
                    fecjVar.X(fddhVar3);
                    fdde fddeVar = (fdde) fecjVar;
                    if (!fddeVar.b.L()) {
                        fddeVar.U();
                    }
                    fddh fddhVar4 = (fddh) fddeVar.b;
                    fddhVar4.x = null;
                    fddhVar4.c &= -1048577;
                    contextFenceStub.a = (fddh) fddeVar.Q();
                } else {
                    fddh fddhVar5 = contextFenceStub.a;
                    arwm.s(fddhVar5);
                    fecj fecjVar2 = (fecj) fddhVar5.iB(5, null);
                    fecjVar2.X(fddhVar5);
                    fdde fddeVar2 = (fdde) fecjVar2;
                    if (!fddeVar2.b.L()) {
                        fddeVar2.U();
                    }
                    fddh fddhVar6 = (fddh) fddeVar2.b;
                    fddhVar6.x = fdfbVar;
                    fddhVar6.c |= 1048576;
                    contextFenceStub.a = (fddh) fddeVar2.Q();
                }
                z = true;
            }
            z |= contextFenceStub.k();
        }
        if (z) {
            fddh fddhVar7 = this.a;
            arwm.s(fddhVar7);
            ArrayList arrayList = new ArrayList(fddhVar7.e.size());
            ArrayList g2 = g();
            int size2 = g2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList.add(((ContextFenceStub) g2.get(i2)).f());
            }
            fddh fddhVar8 = this.a;
            arwm.s(fddhVar8);
            fecj fecjVar3 = (fecj) fddhVar8.iB(5, null);
            fecjVar3.X(fddhVar8);
            fdde fddeVar3 = (fdde) fecjVar3;
            if (!fddeVar3.b.L()) {
                fddeVar3.U();
            }
            ((fddh) fddeVar3.b).e = feeq.a;
            fddeVar3.a(arrayList);
            this.a = (fddh) fddeVar3.Q();
            this.c = null;
        }
        return z;
    }

    public final byte[] l() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr;
        }
        fddh fddhVar = this.a;
        arwm.s(fddhVar);
        return fddhVar.r();
    }

    public final String toString() {
        m();
        fddh fddhVar = this.a;
        arwm.s(fddhVar);
        return fddhVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, l(), false);
        arxc.c(parcel, a);
    }

    public ContextFenceStub(byte[] bArr) {
        this.a = null;
        this.b = bArr;
        n();
    }
}
