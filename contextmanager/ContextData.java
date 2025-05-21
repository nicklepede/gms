package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.atnt;
import defpackage.atoi;
import defpackage.ator;
import defpackage.atox;
import defpackage.fdcy;
import defpackage.fdcz;
import defpackage.fdda;
import defpackage.fddc;
import defpackage.fddj;
import defpackage.fddk;
import defpackage.fdee;
import defpackage.fdfo;
import defpackage.febe;
import defpackage.febu;
import defpackage.febw;
import defpackage.fecd;
import defpackage.fecj;
import defpackage.fecl;
import defpackage.feco;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.qom;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ContextData extends AbstractSafeParcelable {
    public static qom d;
    public fdcz b;
    public byte[] c;
    private atoi e;
    private atox f;
    private ator g;
    public static final int[] a = {0, 1};
    public static final Parcelable.Creator CREATOR = new atnt();

    public ContextData(fdcz fdczVar) {
        arwm.s(fdczVar);
        this.b = fdczVar;
        this.c = null;
    }

    public static final boolean m(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    public static byte[] p(fdcz fdczVar) {
        if ((fdczVar.b & 64) != 0) {
            fdda fddaVar = fdczVar.i;
            if (fddaVar == null) {
                fddaVar = fdda.a;
            }
            byte[] r = fddaVar.r();
            if (r.length == 0) {
                return r;
            }
            febe O = febe.O(r);
            try {
                O.m();
                return O.H(O.j());
            } catch (IOException e) {
                Log.e("ContextData", "Could not read extension.", e);
            }
        }
        return null;
    }

    private final void q() {
        byte[] bArr;
        if (l() || (bArr = this.c) == null) {
            return;
        }
        try {
            fecp y = fecp.y(fdcz.a, bArr, 0, bArr.length, febw.a());
            fecp.M(y);
            this.b = (fdcz) y;
            this.c = null;
        } catch (fedk e) {
            Log.e("ContextData", "Could not deserialize context bytes.", e);
            throw new IllegalStateException(e);
        }
    }

    public final int a() {
        q();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        int a2 = fddc.a(fdczVar.e);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final int b() {
        q();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        fddj b = fddj.b(fdczVar.f);
        if (b == null) {
            b = fddj.UNKNOWN_CONTEXT_NAME;
        }
        return b.gh;
    }

    public final int c() {
        q();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        int a2 = fdcy.a(fdczVar.g);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final atoi d() {
        q();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        if ((fdczVar.b & 2) == 0) {
            return null;
        }
        fdcz fdczVar2 = this.b;
        arwm.s(fdczVar2);
        fddk fddkVar = fdczVar2.d;
        if (fddkVar == null) {
            fddkVar = fddk.a;
        }
        if (fddkVar.f.isEmpty() || fddkVar.g.isEmpty()) {
            return null;
        }
        if (this.e == null) {
            fdcz fdczVar3 = this.b;
            arwm.s(fdczVar3);
            fddk fddkVar2 = fdczVar3.d;
            if (fddkVar2 == null) {
                fddkVar2 = fddk.a;
            }
            this.e = new atoi(fddkVar2);
        }
        return this.e;
    }

    public final ator e() {
        q();
        arwm.s(this.b);
        fdcz fdczVar = this.b;
        if ((fdczVar.b & 128) == 0) {
            return null;
        }
        if (this.g == null) {
            fdee fdeeVar = fdczVar.k;
            if (fdeeVar == null) {
                fdeeVar = fdee.a;
            }
            this.g = new ator(fdeeVar);
        }
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextData)) {
            return false;
        }
        ContextData contextData = (ContextData) obj;
        q();
        contextData.q();
        if (j().equals(contextData.j())) {
            fdcz fdczVar = this.b;
            arwm.s(fdczVar);
            fddk fddkVar = fdczVar.d;
            if (fddkVar == null) {
                fddkVar = fddk.a;
            }
            int i = fddkVar.e;
            fdcz fdczVar2 = contextData.b;
            arwm.s(fdczVar2);
            fddk fddkVar2 = fdczVar2.d;
            if (fddkVar2 == null) {
                fddkVar2 = fddk.a;
            }
            if (i == fddkVar2.e) {
                return true;
            }
        }
        return false;
    }

    public final atox f() {
        q();
        arwm.s(this.b);
        fdcz fdczVar = this.b;
        if ((fdczVar.b & 32) == 0) {
            return null;
        }
        if (this.f == null) {
            fdfo fdfoVar = fdczVar.h;
            if (fdfoVar == null) {
                fdfoVar = fdfo.a;
            }
            this.f = new atox(fdfoVar);
        }
        return this.f;
    }

    public final fdcz g() {
        q();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        return fdczVar;
    }

    public final fddj h() {
        q();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        fddj b = fddj.b(fdczVar.f);
        return b == null ? fddj.UNKNOWN_CONTEXT_NAME : b;
    }

    public final int hashCode() {
        q();
        String j = j();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        fddk fddkVar = fdczVar.d;
        if (fddkVar == null) {
            fddkVar = fddk.a;
        }
        return Arrays.hashCode(new Object[]{j, Integer.valueOf(fddkVar.e)});
    }

    public final Object i(febu febuVar) {
        q();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        fdda fddaVar = fdczVar.i;
        if (fddaVar == null) {
            fddaVar = fdda.a;
        }
        fddaVar.f(febuVar);
        fecd fecdVar = fddaVar.s;
        feco fecoVar = febuVar.d;
        if (!fecdVar.m(fecoVar)) {
            return null;
        }
        fdcz fdczVar2 = this.b;
        arwm.s(fdczVar2);
        fdda fddaVar2 = fdczVar2.i;
        if (fddaVar2 == null) {
            fddaVar2 = fdda.a;
        }
        fddaVar2.f(febuVar);
        Object k = fddaVar2.s.k(fecoVar);
        return k == null ? febuVar.b : febuVar.d(k);
    }

    public final String j() {
        q();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        return fdczVar.c;
    }

    public final void k(String str, String str2) {
        q();
        arwm.s(this.b);
        fdcz fdczVar = this.b;
        fecj fecjVar = (fecj) fdczVar.iB(5, null);
        fecjVar.X(fdczVar);
        fddk fddkVar = this.b.d;
        if (fddkVar == null) {
            fddkVar = fddk.a;
        }
        fecj fecjVar2 = (fecj) fddkVar.iB(5, null);
        fecjVar2.X(fddkVar);
        fecl feclVar = (fecl) fecjVar2;
        if (!feclVar.b.L()) {
            feclVar.U();
        }
        fddk fddkVar2 = (fddk) feclVar.b;
        str.getClass();
        fddkVar2.b |= 16;
        fddkVar2.g = str;
        if (!feclVar.b.L()) {
            feclVar.U();
        }
        fddk fddkVar3 = (fddk) feclVar.b;
        str2.getClass();
        fddkVar3.b |= 8;
        fddkVar3.f = str2;
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        fdcz fdczVar2 = (fdcz) fecjVar.b;
        fddk fddkVar4 = (fddk) feclVar.Q();
        fddkVar4.getClass();
        fdczVar2.d = fddkVar4;
        fdczVar2.b |= 2;
        this.b = (fdcz) fecjVar.Q();
        fddk fddkVar5 = this.b.d;
        if (fddkVar5 == null) {
            fddkVar5 = fddk.a;
        }
        this.e = new atoi(fddkVar5);
    }

    public final boolean l() {
        return this.b != null;
    }

    public final byte[] n() {
        byte[] bArr = this.c;
        if (bArr != null) {
            return bArr;
        }
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        return fdczVar.r();
    }

    public final byte[] o() {
        q();
        fdcz fdczVar = this.b;
        arwm.s(fdczVar);
        return p(fdczVar);
    }

    public final String toString() {
        q();
        arwm.s(this.b);
        return d == null ? this.b.toString() : Base64.encodeToString(this.b.r(), 2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        arxc.i(parcel, 2, n(), false);
        arxc.c(parcel, a2);
    }

    public ContextData(byte[] bArr) {
        this.b = null;
        arwm.s(bArr);
        this.c = bArr;
    }
}
