package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.avtc;
import defpackage.avtd;
import defpackage.avtf;
import defpackage.avtk;
import defpackage.avto;
import defpackage.avtu;
import defpackage.avtv;
import defpackage.avtw;
import defpackage.avtx;
import defpackage.avty;
import defpackage.avtz;
import defpackage.avua;
import defpackage.avub;
import defpackage.avud;
import defpackage.avue;
import defpackage.avuf;
import defpackage.avug;
import defpackage.avuh;
import defpackage.avuj;
import defpackage.avuk;
import defpackage.ffrg;
import defpackage.ffrj;
import defpackage.ffrn;
import defpackage.ffrv;
import defpackage.ffrx;
import defpackage.ffry;
import defpackage.ffse;
import defpackage.ffsz;
import defpackage.ffte;
import defpackage.ffth;
import defpackage.fftk;
import defpackage.fftn;
import defpackage.fftr;
import defpackage.ffts;
import defpackage.fftv;
import defpackage.ffty;
import defpackage.fftz;
import defpackage.ffuc;
import defpackage.ffui;
import defpackage.fful;
import defpackage.ffuo;
import defpackage.ffur;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgtj;
import defpackage.fywe;
import defpackage.sdz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ContextFenceStub extends AwarenessFence implements avto {
    public static final Parcelable.Creator CREATOR = new avtk();
    private ffry a;
    private byte[] b;
    private ArrayList c;
    private avug d;
    private avug e;
    private avtv f;
    private avtz g;
    private avtc h;
    private avud i;
    private avua j;
    private avty k;
    private avtd l;
    private avtf m;
    private avtw n;
    private avuh o;
    private avtx p;
    private avub q;
    private avtu r;
    private avuf s;
    private avuj t;
    private avue u;
    private avuk v;

    public ContextFenceStub(ffry ffryVar) {
        atzb.s(ffryVar);
        this.a = ffryVar;
        this.b = null;
        n();
    }

    public static ContextFenceStub c(avug avugVar) {
        ffrv ffrvVar;
        ffui ffuiVar = avugVar.b;
        if (ffuiVar.g) {
            ffrvVar = (ffrv) ffry.b.v();
            ffrx ffrxVar = ffrx.LOCAL_TIME_FENCE;
            if (!ffrvVar.b.L()) {
                ffrvVar.U();
            }
            ffry ffryVar = (ffry) ffrvVar.b;
            ffryVar.d = ffrxVar.z;
            ffryVar.c |= 1;
            if (!ffrvVar.b.L()) {
                ffrvVar.U();
            }
            ffry ffryVar2 = (ffry) ffrvVar.b;
            ffryVar2.u = ffuiVar;
            ffryVar2.c |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        } else {
            ffrvVar = (ffrv) ffry.b.v();
            ffrx ffrxVar2 = ffrx.TIME_FENCE;
            if (!ffrvVar.b.L()) {
                ffrvVar.U();
            }
            ffry ffryVar3 = (ffry) ffrvVar.b;
            ffryVar3.d = ffrxVar2.z;
            ffryVar3.c |= 1;
            if (!ffrvVar.b.L()) {
                ffrvVar.U();
            }
            ffry ffryVar4 = (ffry) ffrvVar.b;
            ffryVar4.f = ffuiVar;
            ffryVar4.c |= 2;
        }
        return new ContextFenceStub((ffry) ffrvVar.Q());
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
                atzb.s(bArr);
                fgri y = fgri.y(ffry.b, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                this.a = (ffry) y;
                this.b = null;
            } catch (fgsd e) {
                sdz.b("ContextFenceStub", "Could not deserialize context fence bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        n();
    }

    private final void n() {
        ffry ffryVar = this.a;
        if (ffryVar != null || this.b == null) {
            if (ffryVar == null || this.b != null) {
                if (ffryVar != null && this.b != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (ffryVar != null || this.b != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // defpackage.avto
    public final int a() {
        avto d = d();
        if (d == null) {
            return -2;
        }
        return d.a();
    }

    public final int b() {
        m();
        ffry ffryVar = this.a;
        atzb.s(ffryVar);
        if ((ffryVar.c & 1) == 0) {
            return 0;
        }
        ffry ffryVar2 = this.a;
        atzb.s(ffryVar2);
        ffrx b = ffrx.b(ffryVar2.d);
        if (b == null) {
            b = ffrx.UNKNOWN_CONTEXT_FENCE_TYPE;
        }
        return b.z;
    }

    public final avto d() {
        switch (b()) {
            case 4:
                m();
                ffry ffryVar = this.a;
                atzb.s(ffryVar);
                if ((ffryVar.c & 2) != 0) {
                    if (this.d == null) {
                        ffry ffryVar2 = this.a;
                        atzb.s(ffryVar2);
                        ffui ffuiVar = ffryVar2.f;
                        if (ffuiVar == null) {
                            ffuiVar = ffui.a;
                        }
                        this.d = new avug(ffuiVar);
                    }
                    return this.d;
                }
            case 1:
            case 2:
            case 3:
            case fywe.v /* 22 */:
                return null;
            case 5:
                m();
                ffry ffryVar3 = this.a;
                atzb.s(ffryVar3);
                if ((ffryVar3.c & 4) == 0) {
                    return null;
                }
                if (this.f == null) {
                    ffry ffryVar4 = this.a;
                    atzb.s(ffryVar4);
                    ffsz ffszVar = ffryVar4.g;
                    if (ffszVar == null) {
                        ffszVar = ffsz.a;
                    }
                    this.f = new avtv(ffszVar);
                }
                return this.f;
            case 6:
                return e();
            case 7:
                m();
                ffry ffryVar5 = this.a;
                atzb.s(ffryVar5);
                if ((ffryVar5.c & 16) == 0) {
                    return null;
                }
                if (this.h == null) {
                    ffry ffryVar6 = this.a;
                    atzb.s(ffryVar6);
                    ffrg ffrgVar = ffryVar6.i;
                    if (ffrgVar == null) {
                        ffrgVar = ffrg.b;
                    }
                    this.h = new avtc(ffrgVar);
                }
                return this.h;
            case 8:
                m();
                ffry ffryVar7 = this.a;
                atzb.s(ffryVar7);
                if ((ffryVar7.c & 32) == 0) {
                    return null;
                }
                if (this.i == null) {
                    ffry ffryVar8 = this.a;
                    atzb.s(ffryVar8);
                    ffty fftyVar = ffryVar8.j;
                    if (fftyVar == null) {
                        fftyVar = ffty.a;
                    }
                    this.i = new avud(fftyVar);
                }
                return this.i;
            case 9:
                m();
                ffry ffryVar9 = this.a;
                atzb.s(ffryVar9);
                if ((ffryVar9.c & 64) == 0) {
                    return null;
                }
                if (this.j == null) {
                    ffry ffryVar10 = this.a;
                    atzb.s(ffryVar10);
                    fftr fftrVar = ffryVar10.k;
                    if (fftrVar == null) {
                        fftrVar = fftr.b;
                    }
                    this.j = new avua(fftrVar);
                }
                return this.j;
            case 10:
                m();
                ffry ffryVar11 = this.a;
                atzb.s(ffryVar11);
                if ((ffryVar11.c & 128) == 0) {
                    return null;
                }
                if (this.k == null) {
                    ffry ffryVar12 = this.a;
                    atzb.s(ffryVar12);
                    fftk fftkVar = ffryVar12.l;
                    if (fftkVar == null) {
                        fftkVar = fftk.a;
                    }
                    this.k = new avty(fftkVar);
                }
                return this.k;
            case 11:
                m();
                ffry ffryVar13 = this.a;
                atzb.s(ffryVar13);
                if ((ffryVar13.c & 256) == 0) {
                    return null;
                }
                if (this.l == null) {
                    ffry ffryVar14 = this.a;
                    atzb.s(ffryVar14);
                    ffrj ffrjVar = ffryVar14.m;
                    if (ffrjVar == null) {
                        ffrjVar = ffrj.a;
                    }
                    this.l = new avtd(ffrjVar);
                }
                return this.l;
            case 12:
                m();
                ffry ffryVar15 = this.a;
                atzb.s(ffryVar15);
                if ((ffryVar15.c & 512) == 0) {
                    return null;
                }
                if (this.m == null) {
                    ffry ffryVar16 = this.a;
                    atzb.s(ffryVar16);
                    ffrn ffrnVar = ffryVar16.n;
                    if (ffrnVar == null) {
                        ffrnVar = ffrn.a;
                    }
                    this.m = new avtf(ffrnVar);
                }
                return this.m;
            case 13:
                m();
                ffry ffryVar17 = this.a;
                atzb.s(ffryVar17);
                if ((ffryVar17.c & 1024) == 0) {
                    return null;
                }
                if (this.n == null) {
                    ffry ffryVar18 = this.a;
                    atzb.s(ffryVar18);
                    ffte ffteVar = ffryVar18.o;
                    if (ffteVar == null) {
                        ffteVar = ffte.c;
                    }
                    this.n = new avtw(ffteVar);
                }
                return this.n;
            case 14:
            default:
                sdz.d("ContextFenceStub", "Unknown fence stub type=%s", Integer.valueOf(b()));
                return null;
            case 15:
                m();
                ffry ffryVar19 = this.a;
                atzb.s(ffryVar19);
                if ((ffryVar19.c & 8192) == 0) {
                    return null;
                }
                if (this.o == null) {
                    ffry ffryVar20 = this.a;
                    atzb.s(ffryVar20);
                    fful ffulVar = ffryVar20.p;
                    if (ffulVar == null) {
                        ffulVar = fful.a;
                    }
                    this.o = new avuh(ffulVar);
                }
                return this.o;
            case 16:
                m();
                ffry ffryVar21 = this.a;
                atzb.s(ffryVar21);
                if ((ffryVar21.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) {
                    return null;
                }
                if (this.r == null) {
                    ffry ffryVar22 = this.a;
                    atzb.s(ffryVar22);
                    ffse ffseVar = ffryVar22.q;
                    if (ffseVar == null) {
                        ffseVar = ffse.a;
                    }
                    this.r = new avtu(ffseVar);
                }
                return this.r;
            case fywe.q /* 17 */:
                m();
                ffry ffryVar23 = this.a;
                atzb.s(ffryVar23);
                if ((ffryVar23.c & 32768) == 0) {
                    return null;
                }
                if (this.p == null) {
                    ffry ffryVar24 = this.a;
                    atzb.s(ffryVar24);
                    ffth ffthVar = ffryVar24.r;
                    if (ffthVar == null) {
                        ffthVar = ffth.a;
                    }
                    this.p = new avtx(ffthVar);
                }
                return this.p;
            case 18:
                m();
                ffry ffryVar25 = this.a;
                atzb.s(ffryVar25);
                if ((ffryVar25.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) == 0) {
                    return null;
                }
                if (this.q == null) {
                    ffry ffryVar26 = this.a;
                    atzb.s(ffryVar26);
                    fftv fftvVar = ffryVar26.s;
                    if (fftvVar == null) {
                        fftvVar = fftv.a;
                    }
                    this.q = new avub(fftvVar);
                }
                return this.q;
            case 19:
                m();
                ffry ffryVar27 = this.a;
                atzb.s(ffryVar27);
                if ((ffryVar27.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) == 0) {
                    return null;
                }
                if (this.s == null) {
                    ffry ffryVar28 = this.a;
                    atzb.s(ffryVar28);
                    ffuc ffucVar = ffryVar28.t;
                    if (ffucVar == null) {
                        ffucVar = ffuc.a;
                    }
                    this.s = new avuf(ffucVar);
                }
                return this.s;
            case fywe.t /* 20 */:
                m();
                ffry ffryVar29 = this.a;
                atzb.s(ffryVar29);
                if ((ffryVar29.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) == 0) {
                    return null;
                }
                if (this.e == null) {
                    ffry ffryVar30 = this.a;
                    atzb.s(ffryVar30);
                    ffui ffuiVar2 = ffryVar30.u;
                    if (ffuiVar2 == null) {
                        ffuiVar2 = ffui.a;
                    }
                    this.e = new avug(ffuiVar2);
                }
                return this.e;
            case fywe.u /* 21 */:
                m();
                ffry ffryVar31 = this.a;
                atzb.s(ffryVar31);
                if ((ffryVar31.c & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) == 0) {
                    return null;
                }
                if (this.t == null) {
                    ffry ffryVar32 = this.a;
                    atzb.s(ffryVar32);
                    ffuo ffuoVar = ffryVar32.v;
                    if (ffuoVar == null) {
                        ffuoVar = ffuo.a;
                    }
                    this.t = new avuj(ffuoVar);
                }
                return this.t;
            case fywe.w /* 23 */:
                m();
                ffry ffryVar33 = this.a;
                atzb.s(ffryVar33);
                if ((ffryVar33.c & 2097152) == 0) {
                    return null;
                }
                if (this.u == null) {
                    ffry ffryVar34 = this.a;
                    atzb.s(ffryVar34);
                    fftz fftzVar = ffryVar34.y;
                    if (fftzVar == null) {
                        fftzVar = fftz.a;
                    }
                    this.u = new avue(fftzVar);
                }
                return this.u;
            case fywe.x /* 24 */:
                m();
                ffry ffryVar35 = this.a;
                atzb.s(ffryVar35);
                if ((ffryVar35.c & 4194304) == 0) {
                    return null;
                }
                if (this.v == null) {
                    ffry ffryVar36 = this.a;
                    atzb.s(ffryVar36);
                    ffur ffurVar = ffryVar36.z;
                    if (ffurVar == null) {
                        ffurVar = ffur.a;
                    }
                    this.v = new avuk(ffurVar);
                }
                return this.v;
        }
    }

    public final avtz e() {
        m();
        ffry ffryVar = this.a;
        atzb.s(ffryVar);
        if ((ffryVar.c & 8) == 0) {
            return null;
        }
        if (this.g == null) {
            ffry ffryVar2 = this.a;
            atzb.s(ffryVar2);
            fftn fftnVar = ffryVar2.h;
            if (fftnVar == null) {
                fftnVar = fftn.a;
            }
            this.g = new avtz(fftnVar);
        }
        return this.g;
    }

    public final ffry f() {
        m();
        ffry ffryVar = this.a;
        atzb.s(ffryVar);
        return ffryVar;
    }

    public final ArrayList g() {
        m();
        if (this.c == null) {
            ffry ffryVar = this.a;
            atzb.s(ffryVar);
            this.c = new ArrayList(ffryVar.e.size());
            ffry ffryVar2 = this.a;
            atzb.s(ffryVar2);
            for (ffry ffryVar3 : ffryVar2.e) {
                ArrayList arrayList = this.c;
                atzb.s(arrayList);
                arrayList.add(new ContextFenceStub(ffryVar3));
            }
        }
        ArrayList arrayList2 = this.c;
        atzb.s(arrayList2);
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
                avto d = d();
                if (d == null) {
                    sdz.d("ContextFenceStub", "Expected a primitive fence for type=%s", Integer.valueOf(b()));
                } else {
                    set.add(Integer.valueOf(d.a()));
                }
                ffry ffryVar = this.a;
                atzb.s(ffryVar);
                if ((ffryVar.c & 1048576) != 0) {
                    if (d instanceof avtv) {
                        set.addAll(Collections.singletonList(46));
                        return;
                    } else {
                        atzb.s(d);
                        sdz.d("ContextFenceStub", "Predictive fences are not supported for context: %s", Integer.valueOf(d.a()));
                        set.add(-3);
                        return;
                    }
                }
                return;
            }
            ffry ffryVar2 = this.a;
            atzb.s(ffryVar2);
            if ((ffryVar2.c & 1048576) == 0) {
                sdz.c("ContextFenceStub", "Predictive fence without predictive parameters.");
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
            ffry ffryVar = this.a;
            atzb.s(ffryVar);
            if ((ffryVar.c & 1048576) != 0) {
                ffry ffryVar2 = this.a;
                atzb.s(ffryVar2);
                ffts fftsVar = ffryVar2.x;
                if (fftsVar == null) {
                    fftsVar = ffts.a;
                }
                if (fftsVar == null) {
                    ffry ffryVar3 = contextFenceStub.a;
                    atzb.s(ffryVar3);
                    fgrc fgrcVar = (fgrc) ffryVar3.iQ(5, null);
                    fgrcVar.X(ffryVar3);
                    ffrv ffrvVar = (ffrv) fgrcVar;
                    if (!ffrvVar.b.L()) {
                        ffrvVar.U();
                    }
                    ffry ffryVar4 = (ffry) ffrvVar.b;
                    ffryVar4.x = null;
                    ffryVar4.c &= -1048577;
                    contextFenceStub.a = (ffry) ffrvVar.Q();
                } else {
                    ffry ffryVar5 = contextFenceStub.a;
                    atzb.s(ffryVar5);
                    fgrc fgrcVar2 = (fgrc) ffryVar5.iQ(5, null);
                    fgrcVar2.X(ffryVar5);
                    ffrv ffrvVar2 = (ffrv) fgrcVar2;
                    if (!ffrvVar2.b.L()) {
                        ffrvVar2.U();
                    }
                    ffry ffryVar6 = (ffry) ffrvVar2.b;
                    ffryVar6.x = fftsVar;
                    ffryVar6.c |= 1048576;
                    contextFenceStub.a = (ffry) ffrvVar2.Q();
                }
                z = true;
            }
            z |= contextFenceStub.k();
        }
        if (z) {
            ffry ffryVar7 = this.a;
            atzb.s(ffryVar7);
            ArrayList arrayList = new ArrayList(ffryVar7.e.size());
            ArrayList g2 = g();
            int size2 = g2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList.add(((ContextFenceStub) g2.get(i2)).f());
            }
            ffry ffryVar8 = this.a;
            atzb.s(ffryVar8);
            fgrc fgrcVar3 = (fgrc) ffryVar8.iQ(5, null);
            fgrcVar3.X(ffryVar8);
            ffrv ffrvVar3 = (ffrv) fgrcVar3;
            if (!ffrvVar3.b.L()) {
                ffrvVar3.U();
            }
            ((ffry) ffrvVar3.b).e = fgtj.a;
            ffrvVar3.a(arrayList);
            this.a = (ffry) ffrvVar3.Q();
            this.c = null;
        }
        return z;
    }

    public final byte[] l() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return bArr;
        }
        ffry ffryVar = this.a;
        atzb.s(ffryVar);
        return ffryVar.r();
    }

    public final String toString() {
        m();
        ffry ffryVar = this.a;
        atzb.s(ffryVar);
        return ffryVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, l(), false);
        atzr.c(parcel, a);
    }

    public ContextFenceStub(byte[] bArr) {
        this.a = null;
        this.b = bArr;
        n();
    }
}
