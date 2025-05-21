package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbx;
import defpackage.eicy;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WriteDocumentServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbx();
    public final Uri d;
    public final String e;

    public WriteDocumentServerRequest(Account account, byte[] bArr, Uri uri, String str) {
        super(account, (feen) eicy.a.iB(7, null), bArr);
        this.d = uri;
        this.e = str;
    }

    @Override // com.google.android.gms.wallet.service.GenericLiteProtoParcelable, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, 0);
        parcel.writeByteArray(b());
        Uri.writeToParcel(parcel, this.d);
        parcel.writeString(this.e);
    }
}
