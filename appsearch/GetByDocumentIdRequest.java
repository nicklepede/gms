package com.google.android.gms.appsearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vzj;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GetByDocumentIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzj();
    public final String a;
    final List b;
    final Bundle c;

    public GetByDocumentIdRequest(String str, List list, Bundle bundle) {
        this.a = (String) Objects.requireNonNull(str);
        this.b = (List) Objects.requireNonNull(list);
        this.c = (Bundle) Objects.requireNonNull(bundle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.x(parcel, 2, this.b, false);
        atzr.g(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
