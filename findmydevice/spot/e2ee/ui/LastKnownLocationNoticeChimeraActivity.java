package com.google.android.gms.findmydevice.spot.e2ee.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.R;
import com.google.android.gms.findmydevice.spot.e2ee.ui.LastKnownLocationNoticeChimeraActivity;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bfss;
import defpackage.bftj;
import defpackage.bhff;
import defpackage.dzkk;
import defpackage.ekvd;
import defpackage.ekvl;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.fqtl;
import defpackage.iri;
import defpackage.ite;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class LastKnownLocationNoticeChimeraActivity extends ryt {
    private static final ausn l = ausn.b("LklNoticeActivity", auid.FIND_MY_DEVICE_SPOT);
    private static final elgx m = elgx.n("com.google.android.gms.findmydevice.spot.e2ee.ui.LKL_NOTICE", dzkk.LKL_ONLY, "com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_CONTRIBUTOR_NOTICE", dzkk.FMDN_CONTRIBUTOR, "com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_NOTICE", dzkk.FMDN);
    public Button j;
    public Button k;
    private final bftj n = new bftj();
    private TextView o;
    private boolean p;

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        char c;
        super.onCreate(bundle);
        String action = getIntent().getAction();
        ekvl.y(action);
        if (!action.equals("com.google.android.gms.findmydevice.spot.e2ee.ui.LKL_NOTICE") && !action.equals("com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_CONTRIBUTOR_NOTICE") && !action.equals("com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_NOTICE")) {
            ((eluo) ((eluo) l.j()).ai((char) 4088)).B("Unexpected action: %s", action);
            finish();
        }
        boolean z = bundle != null && bundle.getBoolean("PREVIOUSLY_LAUNCHED", false);
        this.p = z;
        if (!z) {
            this.p = true;
            dzkk dzkkVar = (dzkk) m.get(action);
            ekvl.y(dzkkVar);
            Intent a = bhff.a(this, "com.google.android.gms.findmydevice.spot.sync.DismissNotificationIntentOperation", "com.google.android.gms.findmydevice.spot.sync.DISMISS_LKL_TRANSPARENCY_NOTICE");
            if (a != null) {
                a.putExtra("is_activity_opened", true);
                a.putExtra("notice_content", dzkkVar.e);
            }
            ekvl.y(a);
            startService(a);
        }
        int hashCode = action.hashCode();
        if (hashCode == -1576036144) {
            if (action.equals("com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_CONTRIBUTOR_NOTICE")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -688875828) {
            if (hashCode == 1031793764 && action.equals("com.google.android.gms.findmydevice.spot.e2ee.ui.LKL_NOTICE")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_NOTICE")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            setContentView(R.layout.last_known_location_notice);
            ((TextView) findViewById(R.id.titleText)).setText(R.string.lkl_only_notice_title);
            ((TextView) findViewById(R.id.subtitleText)).setText(getString(R.string.lkl_only_notice_subtitle));
            ((TextView) findViewById(R.id.mainContentTextView)).setText(getString(R.string.lkl_only_notice_content));
            TextView textView = (TextView) findViewById(R.id.buttonEncryptionLearnMore);
            this.o = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: bfsp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LastKnownLocationNoticeChimeraActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(fqtl.a.lK().aA())));
                }
            });
        } else if (c == 1) {
            setContentView(R.layout.find_my_device_network_notice);
            ViewStub viewStub = (ViewStub) findViewById(R.id.intro_to_fmdn_stub);
            viewStub.setLayoutResource(R.layout.intro_to_fmdn_contributor);
            TextView textView2 = (TextView) viewStub.inflate().findViewById(R.id.contentFindingOfflineDevicesP3);
            textView2.setText(ite.a(getString(R.string.content_finding_offline_devices_p3, new Object[]{fqtl.w()}), 0));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        } else if (c != 2) {
            ((eluo) ((eluo) l.i()).ai((char) 4087)).B("Unexpected action: %s", action);
            finish();
        } else {
            setContentView(R.layout.find_my_device_network_notice);
            View inflate = ((ViewStub) findViewById(R.id.intro_to_fmdn_stub)).inflate();
            ((TextView) inflate.findViewById(R.id.contentGetHelpFinding)).setText(new ekvd("\n\n").g(getString(R.string.content_get_help_finding_p1_can_now_help), getString(R.string.content_get_help_finding_p2), new Object[0]));
            TextView textView3 = (TextView) inflate.findViewById(R.id.contentHelpOtherFind);
            textView3.setText(ite.a(getString(R.string.content_help_other_find, new Object[]{fqtl.w()}), 0));
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Button button = (Button) findViewById(R.id.buttonSettings);
        this.j = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: bfsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LastKnownLocationNoticeChimeraActivity.this.startActivity(new Intent("com.google.android.gms.settings.FIND_MY_DEVICE_SETTINGS").setPackage("com.google.android.gms").addFlags(268435456));
            }
        });
        Button button2 = (Button) findViewById(R.id.buttonGotIt);
        this.k = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: bfsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LastKnownLocationNoticeChimeraActivity.this.finish();
            }
        });
        this.n.a((NestedScrollView) findViewById(R.id.contentScrollView), (Button) findViewById(R.id.buttonScrollMore), bundle, new bfss(this));
        int i = iri.a;
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.n.b(bundle);
        bundle.putBoolean("PREVIOUSLY_LAUNCHED", this.p);
    }
}
