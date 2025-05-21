package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmmd;
import defpackage.bmmf;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ClearRegistryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmmd();
    public final boolean a;
    public final ClearTypedRegistryOption b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class ClearTypedRegistryOption extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new bmmf();
        public final boolean a;
        public final String b;
        public final boolean c;
        public final List d;

        public ClearTypedRegistryOption(boolean z, String str, boolean z2, List list) {
            fvbo.f(str, "type");
            fvbo.f(list, "registryIds");
            this.a = z;
            this.b = str;
            this.c = z2;
            this.d = list;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            fvbo.f(parcel, "dest");
            boolean z = this.a;
            int a = arxc.a(parcel);
            arxc.e(parcel, 1, z);
            arxc.v(parcel, 2, this.b, false);
            arxc.e(parcel, 3, this.c);
            arxc.x(parcel, 4, this.d, false);
            arxc.c(parcel, a);
        }
    }

    public ClearRegistryRequest(boolean z, ClearTypedRegistryOption clearTypedRegistryOption) {
        this.a = z;
        this.b = clearTypedRegistryOption;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }

    public ClearRegistryRequest() {
        this(true, null);
    }
}
