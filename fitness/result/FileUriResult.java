package com.google.android.gms.fitness.result;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgmg;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FileUriResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bgmg();
    public final Uri a;
    public final Status b;

    public FileUriResult(Uri uri, Status status) {
        this.a = uri;
        this.b = status;
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileUriResult) {
            FileUriResult fileUriResult = (FileUriResult) obj;
            if (this.b.equals(fileUriResult.b) && arwb.b(this.a, fileUriResult.a)) {
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
        arwa.b("status", this.b, arrayList);
        arwa.b("uri", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, uri, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
