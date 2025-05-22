package com.google.android.gms.smartdevice.d2d.metrics;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.arvi;
import defpackage.arvq;
import defpackage.arvr;
import defpackage.arxc;
import defpackage.auad;
import defpackage.dfwf;
import defpackage.dfyl;
import defpackage.dgcj;
import defpackage.dgek;
import defpackage.dgvf;
import defpackage.dgys;
import defpackage.dgyt;
import defpackage.dpxc;
import defpackage.eofi;
import defpackage.eofv;
import defpackage.eofz;
import defpackage.eoge;
import defpackage.eogf;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fuyd;
import defpackage.fuym;
import defpackage.fvae;
import defpackage.tjd;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SourceLogManager implements Parcelable {
    public long b;
    public boolean c;
    public final Deque d;
    public Context e;
    public arvr f;
    private int g;
    private dgek h;
    public static final auad a = new dgyt(new String[]{"Setup", "UI", "SourceLogManager"});
    public static final Parcelable.Creator CREATOR = new dfwf();

    public SourceLogManager() {
        this.g = 1;
        this.d = new ArrayDeque();
    }

    private final void k(eogf eogfVar) {
        fgrc v = eofi.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eofi eofiVar = (eofi) fgriVar;
        eogfVar.getClass();
        eofiVar.d = eogfVar;
        eofiVar.b |= 2;
        long j = this.b;
        if (!fgriVar.L()) {
            v.U();
        }
        eofi eofiVar2 = (eofi) v.b;
        eofiVar2.b |= 1;
        eofiVar2.c = j;
        if (!fvae.a.lK().D()) {
            a.d("Clearcut logging is disabled", new Object[0]);
            return;
        }
        Context context = this.e;
        if (context == null) {
            a.f("Illegal state occurred - context is null", new Object[0]);
            return;
        }
        if (this.f == null) {
            List list = arvr.n;
            this.f = new arvi(context, "SMART_SETUP").a();
        }
        if (fuyd.c()) {
            if (this.h == null) {
                this.h = new dgek(context, this.f);
            }
            this.h.c((eofi) v.Q());
        } else if (fuym.c()) {
            arxc b = dpxc.b(context, new tjd());
            arvq i = this.f.i(v.Q());
            i.p = b;
            i.d();
        } else {
            this.f.i(v.Q()).d();
        }
        a.j("UI event %s", eogfVar);
    }

    public final void a() {
        Deque deque = this.d;
        synchronized (deque) {
            if (!this.c) {
                this.b = dgys.a();
                this.c = true;
            }
            while (!deque.isEmpty()) {
                k((eogf) deque.pop());
            }
        }
    }

    public final void b() {
        fgrc v = eogf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eogf eogfVar = (eogf) v.b;
        eogfVar.d = 6;
        eogfVar.b |= 2;
        j(v);
    }

    public final void c() {
        fgrc v = eogf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eogf eogfVar = (eogf) v.b;
        eogfVar.d = 16;
        eogfVar.b |= 2;
        j(v);
    }

    public final void d() {
        fgrc v = eogf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eogf eogfVar = (eogf) v.b;
        eogfVar.d = 2;
        eogfVar.b = 2 | eogfVar.b;
        j(v);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e() {
        fgrc v = eogf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eogf eogfVar = (eogf) v.b;
        eogfVar.d = 18;
        eogfVar.b |= 2;
        j(v);
    }

    public final void f(dgvf dgvfVar) {
        fgrc v = eogf.a.v();
        fgrc v2 = eofz.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        int i = dgvfVar.b;
        fgri fgriVar = v2.b;
        eofz eofzVar = (eofz) fgriVar;
        eofzVar.b |= 1;
        eofzVar.c = i;
        int i2 = dgvfVar.c;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        eofz eofzVar2 = (eofz) fgriVar2;
        eofzVar2.b |= 4;
        eofzVar2.e = i2;
        int i3 = dgvfVar.d;
        if (!fgriVar2.L()) {
            v2.U();
        }
        fgri fgriVar3 = v2.b;
        eofz eofzVar3 = (eofz) fgriVar3;
        eofzVar3.b |= 8;
        eofzVar3.f = i3;
        boolean z = dgvfVar.a != null;
        if (!fgriVar3.L()) {
            v2.U();
        }
        fgri fgriVar4 = v2.b;
        eofz eofzVar4 = (eofz) fgriVar4;
        eofzVar4.b |= 2;
        eofzVar4.d = z;
        boolean z2 = dgvfVar.e;
        if (!fgriVar4.L()) {
            v2.U();
        }
        fgri fgriVar5 = v2.b;
        eofz eofzVar5 = (eofz) fgriVar5;
        eofzVar5.b |= 16;
        eofzVar5.g = z2;
        boolean z3 = dgvfVar.f;
        if (!fgriVar5.L()) {
            v2.U();
        }
        eofz eofzVar6 = (eofz) v2.b;
        eofzVar6.b |= 32;
        eofzVar6.h = z3;
        eofz eofzVar7 = (eofz) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar6 = v.b;
        eogf eogfVar = (eogf) fgriVar6;
        eogfVar.d = 5;
        eogfVar.b |= 2;
        if (!fgriVar6.L()) {
            v.U();
        }
        eogf eogfVar2 = (eogf) v.b;
        eofzVar7.getClass();
        eogfVar2.i = eofzVar7;
        eogfVar2.b |= 256;
        j(v);
    }

    public final void g(int i) {
        fgrc v = eogf.a.v();
        if (i == -1) {
            if (!v.b.L()) {
                v.U();
            }
            eogf eogfVar = (eogf) v.b;
            eogfVar.d = 9;
            eogfVar.b |= 2;
        } else if (i == 0) {
            if (!v.b.L()) {
                v.U();
            }
            eogf eogfVar2 = (eogf) v.b;
            eogfVar2.d = 11;
            eogfVar2.b |= 2;
        } else if (i == 2) {
            if (!v.b.L()) {
                v.U();
            }
            eogf eogfVar3 = (eogf) v.b;
            eogfVar3.d = 12;
            eogfVar3.b |= 2;
        } else if (i == 3) {
            if (!v.b.L()) {
                v.U();
            }
            eogf eogfVar4 = (eogf) v.b;
            eogfVar4.d = 13;
            eogfVar4.b |= 2;
        } else if (i == 4) {
            if (!v.b.L()) {
                v.U();
            }
            eogf eogfVar5 = (eogf) v.b;
            eogfVar5.d = 15;
            eogfVar5.b |= 2;
        } else if (i != 5) {
            if (!v.b.L()) {
                v.U();
            }
            eogf eogfVar6 = (eogf) v.b;
            eogfVar6.d = 0;
            eogfVar6.b = 2 | eogfVar6.b;
            a.f(a.j(i, "Unknown setup result: "), new Object[0]);
        } else {
            if (!v.b.L()) {
                v.U();
            }
            eogf eogfVar7 = (eogf) v.b;
            eogfVar7.d = 19;
            eogfVar7.b |= 2;
        }
        j(v);
        a();
    }

    public final void h(int i, int i2) {
        fgrc v = eogf.a.v();
        fgrc v2 = eoge.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        int v3 = dgcj.v(i);
        eoge eogeVar = (eoge) v2.b;
        eogeVar.c = v3 - 1;
        eogeVar.b |= 1;
        if (v3 == 1) {
            a.f(a.j(i, "Unknown trigger type: "), new Object[0]);
        }
        if (i2 == -1) {
            if (!v2.b.L()) {
                v2.U();
            }
            eoge eogeVar2 = (eoge) v2.b;
            eogeVar2.d = 3;
            eogeVar2.b |= 2;
        } else if (i2 == 0) {
            if (!v2.b.L()) {
                v2.U();
            }
            eoge eogeVar3 = (eoge) v2.b;
            eogeVar3.d = 1;
            eogeVar3.b |= 2;
        } else if (i2 == 1) {
            if (!v2.b.L()) {
                v2.U();
            }
            eoge eogeVar4 = (eoge) v2.b;
            eogeVar4.d = 2;
            eogeVar4.b |= 2;
        } else if (i2 == 6) {
            if (!v2.b.L()) {
                v2.U();
            }
            eoge eogeVar5 = (eoge) v2.b;
            eogeVar5.d = 4;
            eogeVar5.b |= 2;
        } else if (i2 == 7) {
            if (!v2.b.L()) {
                v2.U();
            }
            eoge eogeVar6 = (eoge) v2.b;
            eogeVar6.d = 5;
            eogeVar6.b |= 2;
        } else if (i2 == 9) {
            if (!v2.b.L()) {
                v2.U();
            }
            eoge eogeVar7 = (eoge) v2.b;
            eogeVar7.d = 6;
            eogeVar7.b |= 2;
        } else if (i2 != 17) {
            if (!v2.b.L()) {
                v2.U();
            }
            eoge eogeVar8 = (eoge) v2.b;
            eogeVar8.d = 8;
            eogeVar8.b |= 2;
            a.m(a.j(i2, "Unknown connection type: "), new Object[0]);
        } else {
            if (!v2.b.L()) {
                v2.U();
            }
            eoge eogeVar9 = (eoge) v2.b;
            eogeVar9.d = 7;
            eogeVar9.b |= 2;
        }
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eogf eogfVar = (eogf) fgriVar;
        eogfVar.d = 1;
        eogfVar.b = 2 | eogfVar.b;
        if (!fgriVar.L()) {
            v.U();
        }
        eogf eogfVar2 = (eogf) v.b;
        eoge eogeVar10 = (eoge) v2.Q();
        eogeVar10.getClass();
        eogfVar2.f = eogeVar10;
        eogfVar2.b |= 32;
        j(v);
    }

    public final void i(int i, byte b, boolean z, int i2) {
        fgrc v = eogf.a.v();
        fgrc v2 = eofv.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        eofv eofvVar = (eofv) fgriVar;
        eofvVar.b |= 1;
        eofvVar.c = i;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        eofv eofvVar2 = (eofv) fgriVar2;
        eofvVar2.b |= 4;
        eofvVar2.e = z;
        if (!fgriVar2.L()) {
            v2.U();
        }
        fgri fgriVar3 = v2.b;
        eofv eofvVar3 = (eofv) fgriVar3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        eofvVar3.f = i3;
        eofvVar3.b |= 8;
        dfyl g = dgcj.g(b);
        if (!fgriVar3.L()) {
            v2.U();
        }
        eofv eofvVar4 = (eofv) v2.b;
        eofvVar4.d = g.k;
        eofvVar4.b |= 2;
        eofv eofvVar5 = (eofv) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar4 = v.b;
        eogf eogfVar = (eogf) fgriVar4;
        eogfVar.d = 3;
        eogfVar.b |= 2;
        if (!fgriVar4.L()) {
            v.U();
        }
        eogf eogfVar2 = (eogf) v.b;
        eofvVar5.getClass();
        eogfVar2.g = eofvVar5;
        eogfVar2.b |= 64;
        j(v);
    }

    public final void j(fgrc fgrcVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        eogf eogfVar = (eogf) fgrcVar.b;
        eogf eogfVar2 = eogf.a;
        eogfVar.b |= 8;
        eogfVar.e = currentTimeMillis;
        Deque deque = this.d;
        synchronized (deque) {
            int i = this.g;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            eogf eogfVar3 = (eogf) fgrcVar.b;
            eogfVar3.b |= 1;
            eogfVar3.c = i;
            this.g++;
            if (this.c) {
                k((eogf) fgrcVar.Q());
            } else {
                deque.add((eogf) fgrcVar.Q());
            }
        }
    }

    @Override // android.os.Parcelable
    public final synchronized void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList;
        parcel.writeInt(this.g);
        parcel.writeLong(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        Deque deque = this.d;
        synchronized (deque) {
            arrayList = new ArrayList(deque.size());
            Iterator it = deque.iterator();
            while (it.hasNext()) {
                arrayList.add(((eogf) it.next()).r());
            }
        }
        parcel.writeList(arrayList);
    }

    public SourceLogManager(Context context) {
        this((byte[]) null);
        this.e = context;
    }

    public SourceLogManager(Parcel parcel) {
        this((byte[]) null);
        this.g = parcel.readInt();
        this.b = parcel.readLong();
        this.c = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, byte[].class.getClassLoader());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            try {
                Deque deque = this.d;
                fgri y = fgri.y(eogf.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                deque.add((eogf) y);
            } catch (fgsd e) {
                a.g("Failed to unparcel mEventQueue with %s", e, new Object[0]);
            }
        }
    }

    public SourceLogManager(byte[] bArr) {
        this.g = 1;
        this.d = new ArrayDeque();
    }
}
