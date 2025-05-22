package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vyv;
import defpackage.vyz;
import defpackage.wau;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class VisibilityPermissionConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wau();
    final int[] a;
    private Integer b;

    static {
        vyv vyvVar = new vyv("VisibilityPermissionType");
        vyz vyzVar = new vyz("allRequiredPermissions");
        vyzVar.b(1);
        vyvVar.c(vyzVar.a());
        vyvVar.a();
    }

    public VisibilityPermissionConfig(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VisibilityPermissionConfig) {
            return Arrays.equals(this.a, ((VisibilityPermissionConfig) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == null) {
            this.b = Integer.valueOf(Arrays.hashCode(this.a));
        }
        return this.b.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int[] iArr = this.a;
        int a = atzr.a(parcel);
        atzr.p(parcel, 1, iArr, false);
        atzr.c(parcel, a);
    }

    public VisibilityPermissionConfig(Set set) {
        Set set2 = (Set) Objects.requireNonNull(set);
        int[] iArr = new int[set2.size()];
        Iterator it = set2.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        this.a = iArr;
    }
}
