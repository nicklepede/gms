package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.metrics.MetricsContext;
import defpackage.abnj$$ExternalSyntheticApiModelOutline0;
import defpackage.affv;
import defpackage.affw;
import defpackage.afmu;
import defpackage.afqt;
import defpackage.afqu;
import defpackage.afra;
import defpackage.afrk;
import defpackage.eiid;
import defpackage.eite;
import defpackage.eitj;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class MetricsContextImpl implements MetricsContext {
    public static final Parcelable.Creator CREATOR = new affv();
    public final HashMap a = new HashMap();
    public final eite b;
    public AtomicInteger c;
    public int d;
    private final int e;
    private final afmu f;
    private final afrk g;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class FillContextImpl implements MetricsContext.FillContext {
        public static final Parcelable.Creator CREATOR = new affw();
        private final eiid a;
        private final eitj b;
        private final eiid c;
        private final boolean d;
        private final boolean e;
        private final boolean f;

        public FillContextImpl(afra afraVar, List list, afqt afqtVar, boolean z, boolean z2, boolean z3) {
            this.a = eiid.i(afraVar);
            this.b = eitj.i(list);
            this.c = eiid.i(afqtVar);
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
        public final eiid a() {
            return this.a;
        }

        @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
        public final eiid b() {
            return this.c;
        }

        @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
        public final eitj c() {
            return this.b;
        }

        @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
        public final boolean d() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
        public final boolean e() {
            return this.f;
        }

        @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
        public final boolean f() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            eiid eiidVar = this.a;
            parcel.writeInt(eiidVar.h() ? 1 : 0);
            if (eiidVar.h()) {
                parcel.writeByteArray(((afra) eiidVar.c()).r());
            }
            eitj eitjVar = this.b;
            parcel.writeInt(eitjVar.size());
            int size = eitjVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeByteArray(((afqu) eitjVar.get(i2)).r());
            }
            eiid eiidVar2 = this.c;
            parcel.writeInt(eiidVar2.h() ? 1 : 0);
            if (eiidVar2.h()) {
                parcel.writeInt(((afqt) eiidVar2.c()).a());
            }
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    public MetricsContextImpl(int i, afmu afmuVar, afrk afrkVar) {
        int i2 = eitj.d;
        this.b = new eite();
        this.c = new AtomicInteger(1);
        this.d = 1;
        this.e = i;
        this.f = afmuVar;
        this.g = afrkVar;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final synchronized int a(AutofillId autofillId) {
        HashMap hashMap;
        hashMap = this.a;
        if (!hashMap.containsKey(autofillId)) {
            int i = this.d;
            this.d = i + 1;
            hashMap.put(autofillId, Integer.valueOf(i));
        }
        return ((Integer) hashMap.get(autofillId)).intValue();
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final int b() {
        return this.c.getAndIncrement();
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final int c() {
        return this.e;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final afmu d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final afrk e() {
        return this.g;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final eitj f() {
        return this.b.g();
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final synchronized void g(MetricsContext.FillContext fillContext) {
        this.b.i(fillContext);
    }

    @Override // android.os.Parcelable
    public final synchronized void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeByteArray(this.f.r());
        parcel.writeByteArray(this.g.r());
        parcel.writeInt(this.c.get());
        parcel.writeInt(this.d);
        HashMap hashMap = this.a;
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeTypedObject(abnj$$ExternalSyntheticApiModelOutline0.m17m(entry.getKey()), i);
            parcel.writeInt(((Integer) entry.getValue()).intValue());
        }
        parcel.writeTypedList(this.b.g());
    }
}
