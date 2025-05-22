package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appsearch.safeparcel.PackageIdentifierParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bsl;
import defpackage.vzw;
import defpackage.wat;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SchemaVisibilityConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wat();
    final List a;
    final List b;
    final PackageIdentifierParcel c;
    private Integer d;
    private List e;
    private Set f;

    public SchemaVisibilityConfig(List list, List list2, PackageIdentifierParcel packageIdentifierParcel) {
        this.a = (List) Objects.requireNonNull(list);
        this.b = (List) Objects.requireNonNull(list2);
        this.c = packageIdentifierParcel;
    }

    public final vzw a() {
        PackageIdentifierParcel packageIdentifierParcel = this.c;
        if (packageIdentifierParcel == null) {
            return null;
        }
        return new vzw(packageIdentifierParcel);
    }

    public final List b() {
        if (this.e == null) {
            List list = this.a;
            this.e = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                this.e.add(new vzw((PackageIdentifierParcel) list.get(i)));
            }
        }
        return this.e;
    }

    public final Set c() {
        bsl bslVar;
        if (this.f == null) {
            List list = this.b;
            this.f = new bsl(list.size());
            for (int i = 0; i < list.size(); i++) {
                int[] iArr = ((VisibilityPermissionConfig) list.get(i)).a;
                if (iArr == null) {
                    bslVar = null;
                } else {
                    bsl bslVar2 = new bsl(iArr.length);
                    for (int i2 : iArr) {
                        bslVar2.add(Integer.valueOf(i2));
                    }
                    bslVar = bslVar2;
                }
                Set set = this.f;
                if (set != null && bslVar != null) {
                    set.add(bslVar);
                }
            }
        }
        return (Set) Objects.requireNonNull(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SchemaVisibilityConfig)) {
            return false;
        }
        SchemaVisibilityConfig schemaVisibilityConfig = (SchemaVisibilityConfig) obj;
        return Objects.equals(this.a, schemaVisibilityConfig.a) && Objects.equals(this.b, schemaVisibilityConfig.b) && Objects.equals(this.c, schemaVisibilityConfig.c);
    }

    public final int hashCode() {
        if (this.d == null) {
            this.d = Integer.valueOf(Objects.hash(this.a, this.b, this.c));
        }
        return this.d.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}
