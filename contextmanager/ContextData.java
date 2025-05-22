package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.avrw;
import defpackage.avsl;
import defpackage.avsu;
import defpackage.avta;
import defpackage.ffrp;
import defpackage.ffrq;
import defpackage.ffrr;
import defpackage.ffrt;
import defpackage.ffsa;
import defpackage.ffsb;
import defpackage.ffsv;
import defpackage.ffuf;
import defpackage.fgpx;
import defpackage.fgqn;
import defpackage.fgqp;
import defpackage.fgqw;
import defpackage.fgrc;
import defpackage.fgre;
import defpackage.fgrh;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.shq;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ContextData extends AbstractSafeParcelable {
    public static shq d;
    public ffrq b;
    public byte[] c;
    private avsl e;
    private avta f;
    private avsu g;
    public static final int[] a = {0, 1};
    public static final Parcelable.Creator CREATOR = new avrw();

    public ContextData(ffrq ffrqVar) {
        atzb.s(ffrqVar);
        this.b = ffrqVar;
        this.c = null;
    }

    public static final boolean m(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    public static byte[] p(ffrq ffrqVar) {
        if ((ffrqVar.b & 64) != 0) {
            ffrr ffrrVar = ffrqVar.i;
            if (ffrrVar == null) {
                ffrrVar = ffrr.a;
            }
            byte[] r = ffrrVar.r();
            if (r.length == 0) {
                return r;
            }
            fgpx O = fgpx.O(r);
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
            fgri y = fgri.y(ffrq.a, bArr, 0, bArr.length, fgqp.a());
            fgri.M(y);
            this.b = (ffrq) y;
            this.c = null;
        } catch (fgsd e) {
            Log.e("ContextData", "Could not deserialize context bytes.", e);
            throw new IllegalStateException(e);
        }
    }

    public final int a() {
        q();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        int a2 = ffrt.a(ffrqVar.e);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final int b() {
        q();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        ffsa b = ffsa.b(ffrqVar.f);
        if (b == null) {
            b = ffsa.UNKNOWN_CONTEXT_NAME;
        }
        return b.go;
    }

    public final int c() {
        q();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        int a2 = ffrp.a(ffrqVar.g);
        if (a2 == 0) {
            a2 = 1;
        }
        return a2 - 1;
    }

    public final avsl d() {
        q();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        if ((ffrqVar.b & 2) == 0) {
            return null;
        }
        ffrq ffrqVar2 = this.b;
        atzb.s(ffrqVar2);
        ffsb ffsbVar = ffrqVar2.d;
        if (ffsbVar == null) {
            ffsbVar = ffsb.a;
        }
        if (ffsbVar.f.isEmpty() || ffsbVar.g.isEmpty()) {
            return null;
        }
        if (this.e == null) {
            ffrq ffrqVar3 = this.b;
            atzb.s(ffrqVar3);
            ffsb ffsbVar2 = ffrqVar3.d;
            if (ffsbVar2 == null) {
                ffsbVar2 = ffsb.a;
            }
            this.e = new avsl(ffsbVar2);
        }
        return this.e;
    }

    public final avsu e() {
        q();
        atzb.s(this.b);
        ffrq ffrqVar = this.b;
        if ((ffrqVar.b & 128) == 0) {
            return null;
        }
        if (this.g == null) {
            ffsv ffsvVar = ffrqVar.k;
            if (ffsvVar == null) {
                ffsvVar = ffsv.a;
            }
            this.g = new avsu(ffsvVar);
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
            ffrq ffrqVar = this.b;
            atzb.s(ffrqVar);
            ffsb ffsbVar = ffrqVar.d;
            if (ffsbVar == null) {
                ffsbVar = ffsb.a;
            }
            int i = ffsbVar.e;
            ffrq ffrqVar2 = contextData.b;
            atzb.s(ffrqVar2);
            ffsb ffsbVar2 = ffrqVar2.d;
            if (ffsbVar2 == null) {
                ffsbVar2 = ffsb.a;
            }
            if (i == ffsbVar2.e) {
                return true;
            }
        }
        return false;
    }

    public final avta f() {
        q();
        atzb.s(this.b);
        ffrq ffrqVar = this.b;
        if ((ffrqVar.b & 32) == 0) {
            return null;
        }
        if (this.f == null) {
            ffuf ffufVar = ffrqVar.h;
            if (ffufVar == null) {
                ffufVar = ffuf.a;
            }
            this.f = new avta(ffufVar);
        }
        return this.f;
    }

    public final ffrq g() {
        q();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        return ffrqVar;
    }

    public final ffsa h() {
        q();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        ffsa b = ffsa.b(ffrqVar.f);
        return b == null ? ffsa.UNKNOWN_CONTEXT_NAME : b;
    }

    public final int hashCode() {
        q();
        String j = j();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        ffsb ffsbVar = ffrqVar.d;
        if (ffsbVar == null) {
            ffsbVar = ffsb.a;
        }
        return Arrays.hashCode(new Object[]{j, Integer.valueOf(ffsbVar.e)});
    }

    public final Object i(fgqn fgqnVar) {
        q();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        ffrr ffrrVar = ffrqVar.i;
        if (ffrrVar == null) {
            ffrrVar = ffrr.a;
        }
        ffrrVar.f(fgqnVar);
        fgqw fgqwVar = ffrrVar.s;
        fgrh fgrhVar = fgqnVar.d;
        if (!fgqwVar.m(fgrhVar)) {
            return null;
        }
        ffrq ffrqVar2 = this.b;
        atzb.s(ffrqVar2);
        ffrr ffrrVar2 = ffrqVar2.i;
        if (ffrrVar2 == null) {
            ffrrVar2 = ffrr.a;
        }
        ffrrVar2.f(fgqnVar);
        Object k = ffrrVar2.s.k(fgrhVar);
        return k == null ? fgqnVar.b : fgqnVar.d(k);
    }

    public final String j() {
        q();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        return ffrqVar.c;
    }

    public final void k(String str, String str2) {
        q();
        atzb.s(this.b);
        ffrq ffrqVar = this.b;
        fgrc fgrcVar = (fgrc) ffrqVar.iQ(5, null);
        fgrcVar.X(ffrqVar);
        ffsb ffsbVar = this.b.d;
        if (ffsbVar == null) {
            ffsbVar = ffsb.a;
        }
        fgrc fgrcVar2 = (fgrc) ffsbVar.iQ(5, null);
        fgrcVar2.X(ffsbVar);
        fgre fgreVar = (fgre) fgrcVar2;
        if (!fgreVar.b.L()) {
            fgreVar.U();
        }
        ffsb ffsbVar2 = (ffsb) fgreVar.b;
        str.getClass();
        ffsbVar2.b |= 16;
        ffsbVar2.g = str;
        if (!fgreVar.b.L()) {
            fgreVar.U();
        }
        ffsb ffsbVar3 = (ffsb) fgreVar.b;
        str2.getClass();
        ffsbVar3.b |= 8;
        ffsbVar3.f = str2;
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        ffrq ffrqVar2 = (ffrq) fgrcVar.b;
        ffsb ffsbVar4 = (ffsb) fgreVar.Q();
        ffsbVar4.getClass();
        ffrqVar2.d = ffsbVar4;
        ffrqVar2.b |= 2;
        this.b = (ffrq) fgrcVar.Q();
        ffsb ffsbVar5 = this.b.d;
        if (ffsbVar5 == null) {
            ffsbVar5 = ffsb.a;
        }
        this.e = new avsl(ffsbVar5);
    }

    public final boolean l() {
        return this.b != null;
    }

    public final byte[] n() {
        byte[] bArr = this.c;
        if (bArr != null) {
            return bArr;
        }
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        return ffrqVar.r();
    }

    public final byte[] o() {
        q();
        ffrq ffrqVar = this.b;
        atzb.s(ffrqVar);
        return p(ffrqVar);
    }

    public final String toString() {
        q();
        atzb.s(this.b);
        return d == null ? this.b.toString() : Base64.encodeToString(this.b.r(), 2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.i(parcel, 2, n(), false);
        atzr.c(parcel, a2);
    }

    public ContextData(byte[] bArr) {
        this.b = null;
        atzb.s(bArr);
        this.c = bArr;
    }
}
