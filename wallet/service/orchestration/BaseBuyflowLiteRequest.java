package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.ehqn;
import defpackage.fgsz;
import defpackage.fgtg;
import defpackage.fgvy;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public abstract class BaseBuyflowLiteRequest extends GenericLiteProtoParcelable {
    private fgvy d;

    public BaseBuyflowLiteRequest(Account account, fgtg fgtgVar, fgsz fgszVar, fgvy fgvyVar, List list) {
        super(account, fgtgVar, fgszVar, list);
        this.d = fgvyVar;
    }

    public final fgvy c() {
        if (this.d == null) {
            this.d = fgvy.a;
        }
        return this.d;
    }

    @Override // com.google.android.gms.wallet.service.GenericLiteProtoParcelable, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fgvy fgvyVar = this.d;
        if (fgvyVar != null) {
            ehqn.o(fgvyVar, parcel);
        }
        super.writeToParcel(parcel, i);
    }

    public BaseBuyflowLiteRequest(Account account, fgtg fgtgVar, byte[] bArr, fgvy fgvyVar, List list) {
        super(account, fgtgVar, bArr, list);
        this.d = fgvyVar;
    }
}
