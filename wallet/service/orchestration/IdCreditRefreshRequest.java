package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dllm;
import defpackage.ekqy;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IdCreditRefreshRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dllm();

    public IdCreditRefreshRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) ekqy.a.iQ(7, null), bArr, list);
    }
}
