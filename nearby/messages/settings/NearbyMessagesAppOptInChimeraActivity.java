package com.google.android.gms.nearby.messages.settings;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity;
import defpackage.bzlt;
import defpackage.bzlw;
import defpackage.cher;
import defpackage.cmqk;
import defpackage.cmql;
import defpackage.ekvk;
import defpackage.eluo;
import defpackage.ezub;
import defpackage.ftdk;
import defpackage.ftfk;
import defpackage.ip;
import defpackage.iq;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NearbyMessagesAppOptInChimeraActivity extends ryt {
    public Button j;
    private String k;
    private cmqk l;
    private CheckBox m;
    private TextView n;
    private iq o;
    private boolean p;

    public static PendingIntent a(Context context, String str) {
        cmqk cmqkVar = new cmqk(context);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInActivity"));
        intent.putExtra("FAIL_IMMEDIATELY", false);
        intent.putExtra("OPT_IN_PACKAGE", str);
        cmqkVar.c();
        intent.putExtra("EXTRA_PACKAGE_DENIED", bzlw.i(cmqkVar.b(), str, false));
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    private final String g() {
        try {
            return getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(this.k, 128)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            ((eluo) ((eluo) cher.a.j()).s(e)).B("Package name no longer exists: %s", this.k);
            b();
            return null;
        }
    }

    private static String h() {
        return ezub.c(ftfk.a.lK().y());
    }

    private final void k(View view) {
        this.m = (CheckBox) view.findViewById(R.id.never_ask_again);
        this.n = (TextView) view.findViewById(R.id.learn_more);
        this.j = (Button) view.findViewById(R.id.opt_in_allow);
        if (!ftfk.a.lK().K() || ftfk.j()) {
            this.n.setMovementMethod(LinkMovementMethod.getInstance());
            Spannable spannable = ftfk.j() ? (Spannable) Html.fromHtml("<a href=\"" + h() + "\">" + getString(R.string.common_learn_more) + "</a>") : (Spannable) Html.fromHtml(getString(R.string.messages_opt_in_text, new Object[]{getResources().getString(R.string.messages_setting_path_v23), h()}));
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                spannable.setSpan(new UnderlineSpan() { // from class: com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInChimeraActivity.1
                    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setUnderlineText(false);
                        textPaint.setColor(NearbyMessagesAppOptInChimeraActivity.this.getResources().getColor(R.color.messages_activity_primary));
                    }
                }, spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 0);
            }
            this.n.setText(spannable);
        } else {
            this.n.setVisibility(8);
        }
        Button button = this.j;
        if (button != null) {
            button.requestFocus();
            this.m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cmqg
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Button button2 = NearbyMessagesAppOptInChimeraActivity.this.j;
                    if (button2 != null) {
                        button2.setEnabled(!z);
                    }
                }
            });
        }
    }

    private final void l(boolean z) {
        if (z) {
            this.m.setVisibility(0);
        }
    }

    public final void b() {
        this.l.d(this.k, false);
        setResult(0, new Intent());
        finish();
    }

    public final void c() {
        this.l.d(this.k, true);
        setResult(-1, new Intent());
        finish();
    }

    public final void f() {
        if (this.m.isChecked()) {
            cmqk cmqkVar = this.l;
            String str = this.k;
            bzlt a = cmqkVar.a();
            a.e(str, false);
            bzlw.g(a);
        }
        cmqk cmqkVar2 = this.l;
        String str2 = this.k;
        bzlt c = cmqkVar2.b().c();
        c.e(str2, true);
        bzlw.g(c);
        b();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        b();
    }

    public void onConfirm(View view) {
        c();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = new cmqk(this);
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.getBoolean("FAIL_IMMEDIATELY") || extras.getString("OPT_IN_PACKAGE") == null) {
            setResult(0, new Intent());
            finish();
            return;
        }
        this.k = extras.getString("OPT_IN_PACKAGE");
        this.p = extras.getBoolean("EXTRA_PACKAGE_DENIED", false);
        if (!ftfk.j()) {
            ((eluo) cher.a.h()).x("Using v1 opt in UX");
            View inflate = getLayoutInflater().inflate(R.layout.messages_opt_in_popup, (ViewGroup) null);
            k(inflate);
            inflate.requestFocus();
            ip ipVar = new ip(this);
            ipVar.setView(inflate);
            ipVar.d(new cmql(this, ekvk.b(g())));
            ipVar.h(new DialogInterface.OnCancelListener() { // from class: cmqf
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    NearbyMessagesAppOptInChimeraActivity.this.b();
                }
            });
            iq create = ipVar.create();
            this.o = create;
            create.setCanceledOnTouchOutside(false);
            this.o.show();
            l(this.p);
            return;
        }
        ((eluo) cher.a.h()).x("Using v2 opt in UX");
        View inflate2 = getLayoutInflater().inflate(R.layout.messages_opt_in_popup_v2, (ViewGroup) null);
        k(inflate2);
        ip ipVar2 = new ip(this);
        ipVar2.n(2131233489);
        ipVar2.l(R.string.messages_opt_in_dialog_with_legal_title);
        ipVar2.p(getString(R.string.messages_opt_in_dialog_with_legal_summary, new Object[]{g(), getString(true != ftdk.a.lK().b() ? R.string.messages_permissions_required_no_microphone : R.string.messages_permissions_required)}));
        ipVar2.setView(inflate2);
        ipVar2.setPositiveButton(R.string.common_allow, new DialogInterface.OnClickListener() { // from class: cmqh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NearbyMessagesAppOptInChimeraActivity.this.c();
            }
        });
        ipVar2.setNegativeButton(R.string.common_deny, new DialogInterface.OnClickListener() { // from class: cmqi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NearbyMessagesAppOptInChimeraActivity.this.f();
            }
        });
        ipVar2.h(new DialogInterface.OnCancelListener() { // from class: cmqj
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                NearbyMessagesAppOptInChimeraActivity.this.b();
            }
        });
        iq create2 = ipVar2.create();
        this.o = create2;
        create2.setCanceledOnTouchOutside(false);
        this.o.show();
        l(this.p);
    }

    public void onDeny(View view) {
        f();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        iq iqVar = this.o;
        if (iqVar != null) {
            iqVar.dismiss();
        }
        super.onDestroy();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        l(this.p);
    }
}
