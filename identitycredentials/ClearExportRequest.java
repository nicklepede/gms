package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import defpackage.arxc;
import defpackage.bmmb;
import defpackage.fvbo;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ClearExportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmmb();
    public final boolean a;
    public final List b;
    public final ClearRegistryRequest.ClearTypedRegistryOption c;

    public ClearExportRequest(boolean z, List list) {
        fvbo.f(list, "registryIds");
        this.a = z;
        this.b = list;
        this.c = new ClearRegistryRequest.ClearTypedRegistryOption(z, "androidx.identitycredentials.TYPE_CREDENTIALS_SYNC", false, list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.x(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
