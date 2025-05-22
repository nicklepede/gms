package com.google.android.gms.autofill.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.metrics.MetricsContext;
import defpackage.abnm$$ExternalSyntheticApiModelOutline0;
import defpackage.ahgh;
import defpackage.ahgi;
import defpackage.ahng;
import defpackage.ahrf;
import defpackage.ahrg;
import defpackage.ahrm;
import defpackage.ahrw;
import defpackage.ekvi;
import defpackage.elgj;
import defpackage.elgo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class MetricsContextImpl implements MetricsContext {
    public static final Parcelable.Creator CREATOR = new ahgh();
    public final HashMap a = new HashMap();
    public final elgj b;
    public AtomicInteger c;
    public int d;
    private final int e;
    private final ahng f;
    private final ahrw g;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class FillContextImpl implements MetricsContext.FillContext {
        public static final Parcelable.Creator CREATOR = new ahgi();
        private final ekvi a;
        private final elgo b;
        private final ekvi c;
        private final boolean d;
        private final boolean e;
        private final boolean f;

        public FillContextImpl(ahrm ahrmVar, List list, ahrf ahrfVar, boolean z, boolean z2, boolean z3) {
            this.a = ekvi.i(ahrmVar);
            this.b = elgo.i(list);
            this.c = ekvi.i(ahrfVar);
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
        public final ekvi a() {
            return this.a;
        }

        @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
        public final ekvi b() {
            return this.c;
        }

        @Override // com.google.android.gms.autofill.metrics.MetricsContext.FillContext
        public final elgo c() {
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
            ekvi ekviVar = this.a;
            parcel.writeInt(ekviVar.h() ? 1 : 0);
            if (ekviVar.h()) {
                parcel.writeByteArray(((ahrm) ekviVar.c()).r());
            }
            elgo elgoVar = this.b;
            parcel.writeInt(elgoVar.size());
            int size = elgoVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeByteArray(((ahrg) elgoVar.get(i2)).r());
            }
            ekvi ekviVar2 = this.c;
            parcel.writeInt(ekviVar2.h() ? 1 : 0);
            if (ekviVar2.h()) {
                parcel.writeInt(((ahrf) ekviVar2.c()).a());
            }
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    public MetricsContextImpl(int i, ahng ahngVar, ahrw ahrwVar) {
        int i2 = elgo.d;
        this.b = new elgj();
        this.c = new AtomicInteger(1);
        this.d = 1;
        this.e = i;
        this.f = ahngVar;
        this.g = ahrwVar;
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
    public final ahng d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final ahrw e() {
        return this.g;
    }

    @Override // com.google.android.gms.autofill.metrics.MetricsContext
    public final elgo f() {
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
            parcel.writeTypedObject(abnm$$ExternalSyntheticApiModelOutline0.m16m(entry.getKey()), i);
            parcel.writeInt(((Integer) entry.getValue()).intValue());
        }
        parcel.writeTypedList(this.b.g());
    }
}
