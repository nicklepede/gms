package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ucw;
import defpackage.uda;
import defpackage.uev;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class VisibilityPermissionConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uev();
    final int[] a;
    private Integer b;

    static {
        ucw ucwVar = new ucw("VisibilityPermissionType");
        uda udaVar = new uda("allRequiredPermissions");
        udaVar.b(1);
        ucwVar.c(udaVar.a());
        ucwVar.a();
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
        int a = arxc.a(parcel);
        arxc.p(parcel, 1, iArr, false);
        arxc.c(parcel, a);
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
