package com.google.android.gms.smartdevice.d2d.metrics;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.apsr;
import defpackage.apsz;
import defpackage.apta;
import defpackage.apul;
import defpackage.arxo;
import defpackage.ddla;
import defpackage.ddng;
import defpackage.ddre;
import defpackage.ddtf;
import defpackage.dekc;
import defpackage.denp;
import defpackage.denq;
import defpackage.dnmt;
import defpackage.elru;
import defpackage.elsh;
import defpackage.elsl;
import defpackage.elsq;
import defpackage.elsr;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fsdg;
import defpackage.fsdp;
import defpackage.fsfh;
import defpackage.rpv;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SourceLogManager implements Parcelable {
    public long b;
    public boolean c;
    public final Deque d;
    public Context e;
    public apta f;
    private int g;
    private ddtf h;
    public static final arxo a = new denq(new String[]{"Setup", "UI", "SourceLogManager"});
    public static final Parcelable.Creator CREATOR = new ddla();

    public SourceLogManager() {
        this.g = 1;
        this.d = new ArrayDeque();
    }

    private final void k(elsr elsrVar) {
        fecj v = elru.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elru elruVar = (elru) fecpVar;
        elsrVar.getClass();
        elruVar.d = elsrVar;
        elruVar.b |= 2;
        long j = this.b;
        if (!fecpVar.L()) {
            v.U();
        }
        elru elruVar2 = (elru) v.b;
        elruVar2.b |= 1;
        elruVar2.c = j;
        if (!fsfh.a.a().D()) {
            a.d("Clearcut logging is disabled", new Object[0]);
            return;
        }
        Context context = this.e;
        if (context == null) {
            a.f("Illegal state occurred - context is null", new Object[0]);
            return;
        }
        if (this.f == null) {
            List list = apta.n;
            this.f = new apsr(context, "SMART_SETUP").a();
        }
        if (fsdg.c()) {
            if (this.h == null) {
                this.h = new ddtf(context, this.f);
            }
            this.h.c((elru) v.Q());
        } else if (fsdp.c()) {
            apul b = dnmt.b(context, new rpv());
            apsz i = this.f.i(v.Q());
            i.p = b;
            i.d();
        } else {
            this.f.i(v.Q()).d();
        }
        a.j("UI event %s", elsrVar);
    }

    public final void a() {
        Deque deque = this.d;
        synchronized (deque) {
            if (!this.c) {
                this.b = denp.a();
                this.c = true;
            }
            while (!deque.isEmpty()) {
                k((elsr) deque.pop());
            }
        }
    }

    public final void b() {
        fecj v = elsr.a.v();
        if (!v.b.L()) {
            v.U();
        }
        elsr elsrVar = (elsr) v.b;
        elsrVar.d = 6;
        elsrVar.b |= 2;
        j(v);
    }

    public final void c() {
        fecj v = elsr.a.v();
        if (!v.b.L()) {
            v.U();
        }
        elsr elsrVar = (elsr) v.b;
        elsrVar.d = 16;
        elsrVar.b |= 2;
        j(v);
    }

    public final void d() {
        fecj v = elsr.a.v();
        if (!v.b.L()) {
            v.U();
        }
        elsr elsrVar = (elsr) v.b;
        elsrVar.d = 2;
        elsrVar.b = 2 | elsrVar.b;
        j(v);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e() {
        fecj v = elsr.a.v();
        if (!v.b.L()) {
            v.U();
        }
        elsr elsrVar = (elsr) v.b;
        elsrVar.d = 18;
        elsrVar.b |= 2;
        j(v);
    }

    public final void f(dekc dekcVar) {
        fecj v = elsr.a.v();
        fecj v2 = elsl.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        int i = dekcVar.b;
        fecp fecpVar = v2.b;
        elsl elslVar = (elsl) fecpVar;
        elslVar.b |= 1;
        elslVar.c = i;
        int i2 = dekcVar.c;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        elsl elslVar2 = (elsl) fecpVar2;
        elslVar2.b |= 4;
        elslVar2.e = i2;
        int i3 = dekcVar.d;
        if (!fecpVar2.L()) {
            v2.U();
        }
        fecp fecpVar3 = v2.b;
        elsl elslVar3 = (elsl) fecpVar3;
        elslVar3.b |= 8;
        elslVar3.f = i3;
        boolean z = dekcVar.a != null;
        if (!fecpVar3.L()) {
            v2.U();
        }
        fecp fecpVar4 = v2.b;
        elsl elslVar4 = (elsl) fecpVar4;
        elslVar4.b |= 2;
        elslVar4.d = z;
        boolean z2 = dekcVar.e;
        if (!fecpVar4.L()) {
            v2.U();
        }
        fecp fecpVar5 = v2.b;
        elsl elslVar5 = (elsl) fecpVar5;
        elslVar5.b |= 16;
        elslVar5.g = z2;
        boolean z3 = dekcVar.f;
        if (!fecpVar5.L()) {
            v2.U();
        }
        elsl elslVar6 = (elsl) v2.b;
        elslVar6.b |= 32;
        elslVar6.h = z3;
        elsl elslVar7 = (elsl) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar6 = v.b;
        elsr elsrVar = (elsr) fecpVar6;
        elsrVar.d = 5;
        elsrVar.b |= 2;
        if (!fecpVar6.L()) {
            v.U();
        }
        elsr elsrVar2 = (elsr) v.b;
        elslVar7.getClass();
        elsrVar2.i = elslVar7;
        elsrVar2.b |= 256;
        j(v);
    }

    public final void g(int i) {
        fecj v = elsr.a.v();
        if (i == -1) {
            if (!v.b.L()) {
                v.U();
            }
            elsr elsrVar = (elsr) v.b;
            elsrVar.d = 9;
            elsrVar.b |= 2;
        } else if (i == 0) {
            if (!v.b.L()) {
                v.U();
            }
            elsr elsrVar2 = (elsr) v.b;
            elsrVar2.d = 11;
            elsrVar2.b |= 2;
        } else if (i == 2) {
            if (!v.b.L()) {
                v.U();
            }
            elsr elsrVar3 = (elsr) v.b;
            elsrVar3.d = 12;
            elsrVar3.b |= 2;
        } else if (i == 3) {
            if (!v.b.L()) {
                v.U();
            }
            elsr elsrVar4 = (elsr) v.b;
            elsrVar4.d = 13;
            elsrVar4.b |= 2;
        } else if (i == 4) {
            if (!v.b.L()) {
                v.U();
            }
            elsr elsrVar5 = (elsr) v.b;
            elsrVar5.d = 15;
            elsrVar5.b |= 2;
        } else if (i != 5) {
            if (!v.b.L()) {
                v.U();
            }
            elsr elsrVar6 = (elsr) v.b;
            elsrVar6.d = 0;
            elsrVar6.b = 2 | elsrVar6.b;
            a.f(a.j(i, "Unknown setup result: "), new Object[0]);
        } else {
            if (!v.b.L()) {
                v.U();
            }
            elsr elsrVar7 = (elsr) v.b;
            elsrVar7.d = 19;
            elsrVar7.b |= 2;
        }
        j(v);
        a();
    }

    public final void h(int i, int i2) {
        fecj v = elsr.a.v();
        fecj v2 = elsq.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        int v3 = ddre.v(i);
        elsq elsqVar = (elsq) v2.b;
        elsqVar.c = v3 - 1;
        elsqVar.b |= 1;
        if (v3 == 1) {
            a.f(a.j(i, "Unknown trigger type: "), new Object[0]);
        }
        if (i2 == -1) {
            if (!v2.b.L()) {
                v2.U();
            }
            elsq elsqVar2 = (elsq) v2.b;
            elsqVar2.d = 3;
            elsqVar2.b |= 2;
        } else if (i2 == 0) {
            if (!v2.b.L()) {
                v2.U();
            }
            elsq elsqVar3 = (elsq) v2.b;
            elsqVar3.d = 1;
            elsqVar3.b |= 2;
        } else if (i2 == 1) {
            if (!v2.b.L()) {
                v2.U();
            }
            elsq elsqVar4 = (elsq) v2.b;
            elsqVar4.d = 2;
            elsqVar4.b |= 2;
        } else if (i2 == 6) {
            if (!v2.b.L()) {
                v2.U();
            }
            elsq elsqVar5 = (elsq) v2.b;
            elsqVar5.d = 4;
            elsqVar5.b |= 2;
        } else if (i2 == 7) {
            if (!v2.b.L()) {
                v2.U();
            }
            elsq elsqVar6 = (elsq) v2.b;
            elsqVar6.d = 5;
            elsqVar6.b |= 2;
        } else if (i2 == 9) {
            if (!v2.b.L()) {
                v2.U();
            }
            elsq elsqVar7 = (elsq) v2.b;
            elsqVar7.d = 6;
            elsqVar7.b |= 2;
        } else if (i2 != 17) {
            if (!v2.b.L()) {
                v2.U();
            }
            elsq elsqVar8 = (elsq) v2.b;
            elsqVar8.d = 8;
            elsqVar8.b |= 2;
            a.m(a.j(i2, "Unknown connection type: "), new Object[0]);
        } else {
            if (!v2.b.L()) {
                v2.U();
            }
            elsq elsqVar9 = (elsq) v2.b;
            elsqVar9.d = 7;
            elsqVar9.b |= 2;
        }
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elsr elsrVar = (elsr) fecpVar;
        elsrVar.d = 1;
        elsrVar.b = 2 | elsrVar.b;
        if (!fecpVar.L()) {
            v.U();
        }
        elsr elsrVar2 = (elsr) v.b;
        elsq elsqVar10 = (elsq) v2.Q();
        elsqVar10.getClass();
        elsrVar2.f = elsqVar10;
        elsrVar2.b |= 32;
        j(v);
    }

    public final void i(int i, byte b, boolean z, int i2) {
        fecj v = elsr.a.v();
        fecj v2 = elsh.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        elsh elshVar = (elsh) fecpVar;
        elshVar.b |= 1;
        elshVar.c = i;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        elsh elshVar2 = (elsh) fecpVar2;
        elshVar2.b |= 4;
        elshVar2.e = z;
        if (!fecpVar2.L()) {
            v2.U();
        }
        fecp fecpVar3 = v2.b;
        elsh elshVar3 = (elsh) fecpVar3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        elshVar3.f = i3;
        elshVar3.b |= 8;
        ddng g = ddre.g(b);
        if (!fecpVar3.L()) {
            v2.U();
        }
        elsh elshVar4 = (elsh) v2.b;
        elshVar4.d = g.k;
        elshVar4.b |= 2;
        elsh elshVar5 = (elsh) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar4 = v.b;
        elsr elsrVar = (elsr) fecpVar4;
        elsrVar.d = 3;
        elsrVar.b |= 2;
        if (!fecpVar4.L()) {
            v.U();
        }
        elsr elsrVar2 = (elsr) v.b;
        elshVar5.getClass();
        elsrVar2.g = elshVar5;
        elsrVar2.b |= 64;
        j(v);
    }

    public final void j(fecj fecjVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        elsr elsrVar = (elsr) fecjVar.b;
        elsr elsrVar2 = elsr.a;
        elsrVar.b |= 8;
        elsrVar.e = currentTimeMillis;
        Deque deque = this.d;
        synchronized (deque) {
            int i = this.g;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            elsr elsrVar3 = (elsr) fecjVar.b;
            elsrVar3.b |= 1;
            elsrVar3.c = i;
            this.g++;
            if (this.c) {
                k((elsr) fecjVar.Q());
            } else {
                deque.add((elsr) fecjVar.Q());
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
                arrayList.add(((elsr) it.next()).r());
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
                fecp y = fecp.y(elsr.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                deque.add((elsr) y);
            } catch (fedk e) {
                a.g("Failed to unparcel mEventQueue with %s", e, new Object[0]);
            }
        }
    }

    public SourceLogManager(byte[] bArr) {
        this.g = 1;
        this.d = new ArrayDeque();
    }
}
