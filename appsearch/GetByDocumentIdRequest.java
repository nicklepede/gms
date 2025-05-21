package com.google.android.gms.appsearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.udk;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GetByDocumentIdRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new udk();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.x(parcel, 2, this.b, false);
        arxc.g(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
