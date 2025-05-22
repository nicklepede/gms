package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.djpk;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UpdateInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djpk();
    public final boolean a;
    private final String b;
    private final String c;
    private final String d;

    public UpdateInfo(boolean z, String str, String str2, String str3) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        if (this.a) {
            return this.b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UpdateInfo)) {
            return false;
        }
        UpdateInfo updateInfo = (UpdateInfo) obj;
        return this.a == updateInfo.a && atyq.b(this.b, updateInfo.b) && atyq.b(this.c, updateInfo.c) && atyq.b(this.d, updateInfo.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("metadataAvailable", Boolean.valueOf(this.a), arrayList);
        atyp.b("targetSdkLevel", this.b, arrayList);
        atyp.b("targetSecurityPatchLevel", this.c, arrayList);
        atyp.b("targetBuildFingerprint", this.d, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.v(parcel, 2, a(), false);
        atzr.v(parcel, 3, z ? this.c : null, false);
        atzr.v(parcel, 4, z ? this.d : null, false);
        atzr.c(parcel, a);
    }
}
