package com.google.android.gms.threadnetwork.credentials.ui;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.threadnetwork.AppContextProvider;
import com.google.android.gms.threadnetwork.ThreadNetworkCredentials;
import com.google.android.gms.threadnetwork.credentials.ui.ShareCredentialsChimeraActivity;
import defpackage.arxd;
import defpackage.asng;
import defpackage.byzc;
import defpackage.dwdg;
import defpackage.ebna;
import defpackage.eitj;
import defpackage.fsmf;
import defpackage.qfp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ShareCredentialsChimeraActivity extends qfp {
    static {
        byzc.a("ShareCredentialsChimeraActivity");
    }

    public static IntentSender a(Context context, String str, ThreadNetworkCredentials threadNetworkCredentials) {
        return g(context, str, eitj.l(threadNetworkCredentials), true);
    }

    public static IntentSender b(Context context, String str, List list) {
        return g(context, str, list, false);
    }

    private static IntentSender g(Context context, String str, List list, boolean z) {
        AppContextProvider.a();
        Intent putExtra = new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.threadnetwork.credentials.ui.ShareCredentialsActivity")).addFlags(JGCastService.FLAG_PRIVATE_DISPLAY).addFlags(8388608).putExtra("extra_caller_name", str);
        if (z) {
            arxd.l((ThreadNetworkCredentials) list.get(0), putExtra, "extra_thread_credentials");
        } else {
            arxd.k(list, putExtra, "extra_thread_credentials_list");
        }
        ClipData clipData = dwdg.a;
        return asng.h(context, putExtra, 1409286144).getIntentSender();
    }

    public final void c(ThreadNetworkCredentials threadNetworkCredentials) {
        if (threadNetworkCredentials != null) {
            Intent intent = new Intent();
            arxd.l(threadNetworkCredentials, intent, "com.google.android.gms.threadnetwork.EXTRA_THREAD_CREDENTIALS");
            setResult(-1, intent);
        } else {
            setResult(0);
        }
        finish();
    }

    protected final void f(String str, final List list, final boolean z) {
        ebna ebnaVar = new ebna(this, R.style.ThreadNetworkDialogTheme);
        ebnaVar.z(R.drawable.quantum_gm_ic_wifi_vd_theme_24);
        ebnaVar.N(getString(R.string.share_credentials_dialog_title, new Object[]{str}));
        ebnaVar.B(R.string.share_credentials_dialog_description);
        ebnaVar.K(R.string.share_credentials_dialog_accept_button_text, new DialogInterface.OnClickListener() { // from class: dfol
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShareCredentialsChimeraActivity shareCredentialsChimeraActivity = ShareCredentialsChimeraActivity.this;
                List list2 = list;
                if (z) {
                    shareCredentialsChimeraActivity.c((ThreadNetworkCredentials) list2.get(0));
                    return;
                }
                Parcelable.Creator creator = ThreadNetworkCredentials.CREATOR;
                Intent intent = new Intent();
                arxd.k(list2, intent, "com.google.android.gms.threadnetwork.EXTRA_THREAD_CREDENTIALS_LIST");
                shareCredentialsChimeraActivity.setResult(-1, intent);
                shareCredentialsChimeraActivity.finish();
            }
        });
        ebnaVar.E(R.string.share_credentials_dialog_decline_button_text, new DialogInterface.OnClickListener() { // from class: dfom
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShareCredentialsChimeraActivity.this.c(null);
            }
        });
        ebnaVar.I(new DialogInterface.OnDismissListener() { // from class: dfon
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ShareCredentialsChimeraActivity shareCredentialsChimeraActivity = ShareCredentialsChimeraActivity.this;
                if (shareCredentialsChimeraActivity.isFinishing()) {
                    return;
                }
                shareCredentialsChimeraActivity.c(null);
            }
        });
        ebnaVar.a();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("extra_caller_name");
        if (fsmf.m()) {
            ArrayList h = arxd.h(intent, "extra_thread_credentials_list", ThreadNetworkCredentials.CREATOR);
            if (stringExtra != null && h != null && !h.isEmpty()) {
                f(stringExtra, h, false);
                return;
            }
        }
        ThreadNetworkCredentials threadNetworkCredentials = (ThreadNetworkCredentials) arxd.b(intent, "extra_thread_credentials", ThreadNetworkCredentials.CREATOR);
        if (stringExtra == null || threadNetworkCredentials == null) {
            c(null);
        } else {
            f(stringExtra, eitj.l(threadNetworkCredentials), true);
        }
    }
}
