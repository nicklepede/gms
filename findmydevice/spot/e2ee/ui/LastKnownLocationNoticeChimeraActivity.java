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
import defpackage.asej;
import defpackage.asot;
import defpackage.bdrg;
import defpackage.bdrx;
import defpackage.bfdp;
import defpackage.dwyk;
import defpackage.eihy;
import defpackage.eiig;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.fobr;
import defpackage.ips;
import defpackage.iro;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LastKnownLocationNoticeChimeraActivity extends qfp {
    private static final asot l = asot.b("LklNoticeActivity", asej.FIND_MY_DEVICE_SPOT);
    private static final eits m = eits.n("com.google.android.gms.findmydevice.spot.e2ee.ui.LKL_NOTICE", dwyk.LKL_ONLY, "com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_CONTRIBUTOR_NOTICE", dwyk.FMDN_CONTRIBUTOR, "com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_NOTICE", dwyk.FMDN);
    public Button j;
    public Button k;
    private final bdrx n = new bdrx();
    private TextView o;
    private boolean p;

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        char c;
        super.onCreate(bundle);
        String action = getIntent().getAction();
        eiig.x(action);
        if (!action.equals("com.google.android.gms.findmydevice.spot.e2ee.ui.LKL_NOTICE") && !action.equals("com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_CONTRIBUTOR_NOTICE") && !action.equals("com.google.android.gms.findmydevice.spot.e2ee.ui.FMDN_NOTICE")) {
            ((ejhf) ((ejhf) l.j()).ah((char) 4082)).B("Unexpected action: %s", action);
            finish();
        }
        boolean z = bundle != null && bundle.getBoolean("PREVIOUSLY_LAUNCHED", false);
        this.p = z;
        if (!z) {
            this.p = true;
            dwyk dwykVar = (dwyk) m.get(action);
            eiig.x(dwykVar);
            Intent a = bfdp.a(this, "com.google.android.gms.findmydevice.spot.sync.DismissNotificationIntentOperation", "com.google.android.gms.findmydevice.spot.sync.DISMISS_LKL_TRANSPARENCY_NOTICE");
            if (a != null) {
                a.putExtra("is_activity_opened", true);
                a.putExtra("notice_content", dwykVar.e);
            }
            eiig.x(a);
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
            textView.setOnClickListener(new View.OnClickListener() { // from class: bdrd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LastKnownLocationNoticeChimeraActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(fobr.a.a().aA())));
                }
            });
        } else if (c == 1) {
            setContentView(R.layout.find_my_device_network_notice);
            ViewStub viewStub = (ViewStub) findViewById(R.id.intro_to_fmdn_stub);
            viewStub.setLayoutResource(R.layout.intro_to_fmdn_contributor);
            TextView textView2 = (TextView) viewStub.inflate().findViewById(R.id.contentFindingOfflineDevicesP3);
            textView2.setText(iro.a(getString(R.string.content_finding_offline_devices_p3, new Object[]{fobr.w()}), 0));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        } else if (c != 2) {
            ((ejhf) ((ejhf) l.i()).ah((char) 4081)).B("Unexpected action: %s", action);
            finish();
        } else {
            setContentView(R.layout.find_my_device_network_notice);
            View inflate = ((ViewStub) findViewById(R.id.intro_to_fmdn_stub)).inflate();
            ((TextView) inflate.findViewById(R.id.contentGetHelpFinding)).setText(new eihy("\n\n").g(getString(R.string.content_get_help_finding_p1_can_now_help), getString(R.string.content_get_help_finding_p2), new Object[0]));
            TextView textView3 = (TextView) inflate.findViewById(R.id.contentHelpOtherFind);
            textView3.setText(iro.a(getString(R.string.content_help_other_find, new Object[]{fobr.w()}), 0));
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Button button = (Button) findViewById(R.id.buttonSettings);
        this.j = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: bdre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LastKnownLocationNoticeChimeraActivity.this.startActivity(new Intent("com.google.android.gms.settings.FIND_MY_DEVICE_SETTINGS").setPackage("com.google.android.gms").addFlags(268435456));
            }
        });
        Button button2 = (Button) findViewById(R.id.buttonGotIt);
        this.k = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: bdrf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LastKnownLocationNoticeChimeraActivity.this.finish();
            }
        });
        this.n.a((NestedScrollView) findViewById(R.id.contentScrollView), (Button) findViewById(R.id.buttonScrollMore), bundle, new bdrg(this));
        int i = ips.a;
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.n.b(bundle);
        bundle.putBoolean("PREVIOUSLY_LAUNCHED", this.p);
    }
}
