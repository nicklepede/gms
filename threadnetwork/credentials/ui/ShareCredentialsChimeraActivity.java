package com.google.android.gms.threadnetwork.credentials.ui;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.threadnetwork.AppContextProvider;
import com.google.android.gms.threadnetwork.ThreadNetworkClientOptions;
import com.google.android.gms.threadnetwork.ThreadNetworkCredentials;
import com.google.android.gms.threadnetwork.credentials.ui.ShareCredentialsChimeraActivity;
import defpackage.aby;
import defpackage.acj;
import defpackage.acr;
import defpackage.atzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.cbht;
import defpackage.dyph;
import defpackage.edzp;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.fvhn;
import defpackage.ryt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ShareCredentialsChimeraActivity extends ryt {
    private static final ausn j = cbht.a("ShareCredentialsChimeraActivity");

    public static IntentSender a(Context context, String str, ThreadNetworkClientOptions threadNetworkClientOptions, ThreadNetworkCredentials threadNetworkCredentials) {
        return k(context, str, threadNetworkClientOptions, elgo.l(threadNetworkCredentials), true);
    }

    public static IntentSender b(Context context, String str, ThreadNetworkClientOptions threadNetworkClientOptions, List list) {
        return k(context, str, threadNetworkClientOptions, list, false);
    }

    private static IntentSender k(Context context, String str, ThreadNetworkClientOptions threadNetworkClientOptions, List list, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        String charSequence = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        AppContextProvider.a();
        IntentSender intentSender = threadNetworkClientOptions.b == 1 ? threadNetworkClientOptions.c : null;
        Intent putExtra = new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.threadnetwork.credentials.ui.ShareCredentialsActivity")).addFlags(8388608).putExtra("extra_caller_name", charSequence);
        if (intentSender != null) {
            putExtra.putExtra("extra_custom_dialog_intent", intentSender);
        } else {
            putExtra.addFlags(JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        if (z) {
            atzs.l((ThreadNetworkCredentials) list.get(0), putExtra, "extra_thread_credentials");
        } else {
            atzs.k(list, putExtra, "extra_thread_credentials_list");
        }
        ClipData clipData = dyph.a;
        return aura.h(context, putExtra, 1409286144).getIntentSender();
    }

    public final void c(List list) {
        Parcelable.Creator creator = ThreadNetworkCredentials.CREATOR;
        Intent intent = new Intent();
        atzs.k(list, intent, "com.google.android.gms.threadnetwork.EXTRA_THREAD_CREDENTIALS_LIST");
        setResult(-1, intent);
        finish();
    }

    public final void f(ThreadNetworkCredentials threadNetworkCredentials) {
        if (threadNetworkCredentials != null) {
            Intent intent = new Intent();
            atzs.l(threadNetworkCredentials, intent, "com.google.android.gms.threadnetwork.EXTRA_THREAD_CREDENTIALS");
            setResult(-1, intent);
        } else {
            setResult(0);
        }
        finish();
    }

    protected final void g(String str, final List list, final boolean z, IntentSender intentSender) {
        if (intentSender != null) {
            ((eluo) ((eluo) j.h()).ai((char) 11235)).x("Custom consent dialog is used");
            h(intentSender, list, z);
            return;
        }
        edzp edzpVar = new edzp(this, R.style.ThreadNetworkDialogTheme);
        edzpVar.z(R.drawable.quantum_gm_ic_wifi_vd_theme_24);
        edzpVar.N(getString(R.string.share_credentials_dialog_title, new Object[]{str}));
        edzpVar.B(R.string.share_credentials_dialog_description);
        edzpVar.K(R.string.share_credentials_dialog_accept_button_text, new DialogInterface.OnClickListener() { // from class: dhzp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShareCredentialsChimeraActivity shareCredentialsChimeraActivity = ShareCredentialsChimeraActivity.this;
                List list2 = list;
                if (z) {
                    shareCredentialsChimeraActivity.f((ThreadNetworkCredentials) list2.get(0));
                } else {
                    shareCredentialsChimeraActivity.c(list2);
                }
            }
        });
        edzpVar.E(R.string.share_credentials_dialog_decline_button_text, new DialogInterface.OnClickListener() { // from class: dhzq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShareCredentialsChimeraActivity.this.f(null);
            }
        });
        edzpVar.I(new DialogInterface.OnDismissListener() { // from class: dhzr
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ShareCredentialsChimeraActivity shareCredentialsChimeraActivity = ShareCredentialsChimeraActivity.this;
                if (shareCredentialsChimeraActivity.isFinishing()) {
                    return;
                }
                shareCredentialsChimeraActivity.f(null);
            }
        });
        edzpVar.a();
    }

    protected final void h(IntentSender intentSender, final List list, final boolean z) {
        try {
            registerForActivityResult(new acr(), new aby() { // from class: dhzs
                @Override // defpackage.aby
                public final void jF(Object obj) {
                    int i = ((ActivityResult) obj).a;
                    ShareCredentialsChimeraActivity shareCredentialsChimeraActivity = ShareCredentialsChimeraActivity.this;
                    if (i != -1) {
                        shareCredentialsChimeraActivity.f(null);
                        return;
                    }
                    List list2 = list;
                    if (z) {
                        shareCredentialsChimeraActivity.f((ThreadNetworkCredentials) list2.get(0));
                    } else {
                        shareCredentialsChimeraActivity.c(list2);
                    }
                }
            }).b(new acj(intentSender).a());
        } catch (ActivityNotFoundException e) {
            ((eluo) ((eluo) ((eluo) j.j()).s(e)).ai((char) 11236)).x("Failed to launch custom consent dialog activity");
            f(null);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("extra_caller_name");
        IntentSender intentSender = (IntentSender) intent.getParcelableExtra("extra_custom_dialog_intent");
        if (fvhn.m()) {
            ArrayList h = atzs.h(intent, "extra_thread_credentials_list", ThreadNetworkCredentials.CREATOR);
            if (stringExtra != null && h != null && !h.isEmpty()) {
                g(stringExtra, h, false, intentSender);
                return;
            }
        }
        ThreadNetworkCredentials threadNetworkCredentials = (ThreadNetworkCredentials) atzs.b(intent, "extra_thread_credentials", ThreadNetworkCredentials.CREATOR);
        if (stringExtra == null || threadNetworkCredentials == null) {
            f(null);
        } else {
            g(stringExtra, elgo.l(threadNetworkCredentials), true, intentSender);
        }
    }
}
