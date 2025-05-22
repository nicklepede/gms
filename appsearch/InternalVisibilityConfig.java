package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vzo;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class InternalVisibilityConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzo();
    public final String a;
    public final boolean b;
    public final SchemaVisibilityConfig c;
    public final List d;

    public InternalVisibilityConfig(String str, boolean z, SchemaVisibilityConfig schemaVisibilityConfig, List list) {
        this.b = z;
        this.a = (String) Objects.requireNonNull(str);
        this.c = (SchemaVisibilityConfig) Objects.requireNonNull(schemaVisibilityConfig);
        this.d = (List) Objects.requireNonNull(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InternalVisibilityConfig)) {
            return false;
        }
        InternalVisibilityConfig internalVisibilityConfig = (InternalVisibilityConfig) obj;
        return this.b == internalVisibilityConfig.b && Objects.equals(this.a, internalVisibilityConfig.a) && Objects.equals(this.c, internalVisibilityConfig.c) && Objects.equals(this.d, internalVisibilityConfig.d);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.b), this.a, this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.e(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}
