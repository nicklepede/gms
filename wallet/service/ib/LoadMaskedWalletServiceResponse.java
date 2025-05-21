package com.google.android.gms.wallet.service.ib;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.ib.LaunchPendingIntentChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.aspj;
import defpackage.dixi;
import defpackage.dixw;
import defpackage.djbh;
import defpackage.djdv;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LoadMaskedWalletServiceResponse implements Parcelable, djdv {
    public static final Parcelable.Creator CREATOR = new dixw();
    public final Bundle a;
    public final MaskedWallet b;
    public final int c;

    public LoadMaskedWalletServiceResponse(Bundle bundle, MaskedWallet maskedWallet, int i) {
        this.a = bundle;
        this.b = maskedWallet;
        this.c = i;
    }

    public static LoadMaskedWalletServiceResponse b(Context context, BuyFlowConfig buyFlowConfig, String str, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        ExecutorService executorService = dixi.a;
        Bundle bundle2 = buyFlowConfig.b.c;
        if (bundle2 == null || bundle2.getInt("com.google.android.gms.wallet.CLIENT") != 1) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT", pendingIntent);
        } else {
            arwm.s(pendingIntent);
            byte[] bArr = new byte[32];
            djbh.c().nextBytes(bArr);
            String b = aspj.b(bArr);
            Intent a = LaunchPendingIntentChimeraActivity.a(b);
            a.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.actualPendingIntentToLaunch", pendingIntent);
            a.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.requestId", "DUMMY_REQUEST_ID_FOR_WRAPPER_PENDING_INTENT");
            a.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig);
            a.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivitygoogleTransactionId", str);
            PendingIntent activity = PendingIntent.getActivity(context, 0, a, 0);
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.wallet.ib.LaunchPendingIntentActivity");
            arxd.l(buyFlowConfig, intent, "com.google.android.gms.wallet.buyFlowConfig");
            intent.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivitygoogleTransactionId", str);
            intent.putExtra("com.google.android.gms.wallet.EXTRA_PENDING_INTENT", activity);
            intent.putExtra("com.google.android.gms.wallet.ib.LaunchPendingIntentActivity.requestId", b);
            bundle.putParcelable("com.google.android.gms.wallet.INTENT", intent);
        }
        return new LoadMaskedWalletServiceResponse(bundle, null, 6);
    }

    @Override // defpackage.djdv
    public final boolean a() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}
