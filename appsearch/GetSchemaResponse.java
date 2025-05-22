package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bsl;
import defpackage.vzk;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GetSchemaResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzk();
    public final int a;
    final List b;
    final List c;
    public Set d;
    public Map e;
    public Map f;
    public Map g;
    public Map h;
    private Set i;

    public GetSchemaResponse(int i, List list, List list2) {
        this.a = i;
        this.b = (List) Objects.requireNonNull(list);
        this.c = list2;
    }

    public final List a() {
        List list = this.c;
        if (list != null) {
            return list;
        }
        throw new UnsupportedOperationException("Get visibility setting is not supported with this backend/Android API level combination.");
    }

    public final Set b() {
        if (this.i == null) {
            this.i = DesugarCollections.unmodifiableSet(new bsl(this.b));
        }
        return this.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.y(parcel, 2, this.b, false);
        atzr.y(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
