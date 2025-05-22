package com.google.android.gms.fitness.result;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biqw;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FileUriResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new biqw();
    public final Uri a;
    public final Status b;

    public FileUriResult(Uri uri, Status status) {
        this.a = uri;
        this.b = status;
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileUriResult) {
            FileUriResult fileUriResult = (FileUriResult) obj;
            if (this.b.equals(fileUriResult.b) && atyq.b(this.a, fileUriResult.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("status", this.b, arrayList);
        atyp.b("uri", this.a, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, uri, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
