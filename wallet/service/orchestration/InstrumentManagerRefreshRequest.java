package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dllp;
import defpackage.ekrj;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InstrumentManagerRefreshRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dllp();

    public InstrumentManagerRefreshRequest(Account account, ekrj ekrjVar, List list) {
        super(account, (fgtg) ekrj.a.iQ(7, null), ekrjVar, list);
    }

    public InstrumentManagerRefreshRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) ekrj.a.iQ(7, null), bArr, list);
    }
}
