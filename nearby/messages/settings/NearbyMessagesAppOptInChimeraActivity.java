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
import defpackage.bxdd;
import defpackage.bxdg;
import defpackage.cexg;
import defpackage.ckif;
import defpackage.ckig;
import defpackage.eiif;
import defpackage.ejhf;
import defpackage.exfs;
import defpackage.fqjs;
import defpackage.fqlp;
import defpackage.ip;
import defpackage.iq;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NearbyMessagesAppOptInChimeraActivity extends qfp {
    public Button j;
    private String k;
    private ckif l;
    private CheckBox m;
    private TextView n;
    private iq o;
    private boolean p;

    public static PendingIntent a(Context context, String str) {
        ckif ckifVar = new ckif(context);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.nearby.messages.settings.NearbyMessagesAppOptInActivity"));
        intent.putExtra("FAIL_IMMEDIATELY", false);
        intent.putExtra("OPT_IN_PACKAGE", str);
        ckifVar.c();
        intent.putExtra("EXTRA_PACKAGE_DENIED", bxdg.i(ckifVar.b(), str, false));
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    private final String g() {
        try {
            return getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(this.k, 128)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            ((ejhf) ((ejhf) cexg.a.j()).s(e)).B("Package name no longer exists: %s", this.k);
            b();
            return null;
        }
    }

    private static String h() {
        return exfs.c(fqlp.a.a().y());
    }

    private final void k(View view) {
        this.m = (CheckBox) view.findViewById(R.id.never_ask_again);
        this.n = (TextView) view.findViewById(R.id.learn_more);
        this.j = (Button) view.findViewById(R.id.opt_in_allow);
        if (!fqlp.a.a().K() || fqlp.j()) {
            this.n.setMovementMethod(LinkMovementMethod.getInstance());
            Spannable spannable = fqlp.j() ? (Spannable) Html.fromHtml("<a href=\"" + h() + "\">" + getString(R.string.common_learn_more) + "</a>") : (Spannable) Html.fromHtml(getString(R.string.messages_opt_in_text, new Object[]{getResources().getString(R.string.messages_setting_path_v23), h()}));
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
            this.m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ckib
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
            ckif ckifVar = this.l;
            String str = this.k;
            bxdd a = ckifVar.a();
            a.e(str, false);
            bxdg.g(a);
        }
        ckif ckifVar2 = this.l;
        String str2 = this.k;
        bxdd c = ckifVar2.b().c();
        c.e(str2, true);
        bxdg.g(c);
        b();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        b();
    }

    public void onConfirm(View view) {
        c();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.l = new ckif(this);
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.getBoolean("FAIL_IMMEDIATELY") || extras.getString("OPT_IN_PACKAGE") == null) {
            setResult(0, new Intent());
            finish();
            return;
        }
        this.k = extras.getString("OPT_IN_PACKAGE");
        this.p = extras.getBoolean("EXTRA_PACKAGE_DENIED", false);
        if (!fqlp.j()) {
            ((ejhf) cexg.a.h()).x("Using v1 opt in UX");
            View inflate = getLayoutInflater().inflate(R.layout.messages_opt_in_popup, (ViewGroup) null);
            k(inflate);
            inflate.requestFocus();
            ip ipVar = new ip(this);
            ipVar.setView(inflate);
            ipVar.d(new ckig(this, eiif.b(g())));
            ipVar.h(new DialogInterface.OnCancelListener() { // from class: ckia
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
        ((ejhf) cexg.a.h()).x("Using v2 opt in UX");
        View inflate2 = getLayoutInflater().inflate(R.layout.messages_opt_in_popup_v2, (ViewGroup) null);
        k(inflate2);
        ip ipVar2 = new ip(this);
        ipVar2.l(2131233423);
        ipVar2.j(R.string.messages_opt_in_dialog_with_legal_title);
        ipVar2.n(getString(R.string.messages_opt_in_dialog_with_legal_summary, new Object[]{g(), getString(true != fqjs.a.a().b() ? R.string.messages_permissions_required_no_microphone : R.string.messages_permissions_required)}));
        ipVar2.setView(inflate2);
        ip positiveButton = ipVar2.setPositiveButton(R.string.common_allow, new DialogInterface.OnClickListener() { // from class: ckic
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NearbyMessagesAppOptInChimeraActivity.this.c();
            }
        });
        positiveButton.setNegativeButton(R.string.common_deny, new DialogInterface.OnClickListener() { // from class: ckid
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NearbyMessagesAppOptInChimeraActivity.this.f();
            }
        });
        positiveButton.h(new DialogInterface.OnCancelListener() { // from class: ckie
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                NearbyMessagesAppOptInChimeraActivity.this.b();
            }
        });
        iq create2 = positiveButton.create();
        this.o = create2;
        create2.setCanceledOnTouchOutside(false);
        this.o.show();
        l(this.p);
    }

    public void onDeny(View view) {
        f();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        iq iqVar = this.o;
        if (iqVar != null) {
            iqVar.dismiss();
        }
        super.onDestroy();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        l(this.p);
    }
}
