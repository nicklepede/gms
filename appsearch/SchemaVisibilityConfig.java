package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appsearch.safeparcel.PackageIdentifierParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bsa;
import defpackage.udx;
import defpackage.ueu;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SchemaVisibilityConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ueu();
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

    public final udx a() {
        PackageIdentifierParcel packageIdentifierParcel = this.c;
        if (packageIdentifierParcel == null) {
            return null;
        }
        return new udx(packageIdentifierParcel);
    }

    public final List b() {
        if (this.e == null) {
            List list = this.a;
            this.e = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                this.e.add(new udx((PackageIdentifierParcel) list.get(i)));
            }
        }
        return this.e;
    }

    public final Set c() {
        bsa bsaVar;
        if (this.f == null) {
            List list = this.b;
            this.f = new bsa(list.size());
            for (int i = 0; i < list.size(); i++) {
                int[] iArr = ((VisibilityPermissionConfig) list.get(i)).a;
                if (iArr == null) {
                    bsaVar = null;
                } else {
                    bsa bsaVar2 = new bsa(iArr.length);
                    for (int i2 : iArr) {
                        bsaVar2.add(Integer.valueOf(i2));
                    }
                    bsaVar = bsaVar2;
                }
                Set set = this.f;
                if (set != null && bsaVar != null) {
                    set.add(bsaVar);
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
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
