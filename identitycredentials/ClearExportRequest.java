package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import defpackage.atzr;
import defpackage.bosu;
import defpackage.fxxm;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ClearExportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bosu();
    public final boolean a;
    public final List b;
    public final ClearRegistryRequest.ClearTypedRegistryOption c;

    public ClearExportRequest(boolean z, List list) {
        fxxm.f(list, "registryIds");
        this.a = z;
        this.b = list;
        this.c = new ClearRegistryRequest.ClearTypedRegistryOption(z, "androidx.identitycredentials.TYPE_CREDENTIALS_SYNC", false, list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.x(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
